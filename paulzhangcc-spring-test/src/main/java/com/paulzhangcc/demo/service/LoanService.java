package com.paulzhangcc.demo.service;

import com.paulzhangcc.demo.util.PrintUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by paul on 2017/7/13.
 */
@Component
public class LoanService implements ApplicationContextAware,BeanNameAware,BeanFactoryAware,InitializingBean{

    public static ApplicationContext context= null;
    @Value("${name.loan}")
    String loan;


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    UserService userService;

    public LoanService() {
        PrintUtil.construct(LoanService.class);
        System.out.println(String.format("执行类[%s]的方法[%s]注入实体bean:", LoanService.class.getSimpleName(),"LoanService")+userService);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(String.format("执行类[%s]的方法[%s]注入实体bean:", LoanService.class.getSimpleName(),"setBeanFactory")+userService);
        PrintUtil.method(LoanService.class,"setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(String.format("执行类[%s]的方法[%s]注入实体bean:", LoanService.class.getSimpleName(),"setBeanName")+userService);
        PrintUtil.method(LoanService.class,"setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("执行类[%s]的方法[%s]注入实体bean:", LoanService.class.getSimpleName(),"afterPropertiesSet")+userService);
        PrintUtil.method(LoanService.class,"afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    @PostConstruct
    public void print(){
        System.out.println("===========userService:"+userService);
    }
}
