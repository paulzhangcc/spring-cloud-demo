package com.paulzhangcc.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.paulzhangcc.demo.util.SpringContextHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paul on 2017/7/6.
 */
//@Component
public class LogFilter  extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        HttpServletResponse response = currentContext.getResponse();
        response.setStatus(302);
        Object applicationContextIdFilter = SpringContextHelper.context.getBean("applicationContextIdFilter");
        System.out.println(applicationContextIdFilter);
        try {
            response.sendRedirect("http://www.baidu.com");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
