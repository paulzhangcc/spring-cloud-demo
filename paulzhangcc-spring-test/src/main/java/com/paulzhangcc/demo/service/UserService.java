package com.paulzhangcc.demo.service;

import com.paulzhangcc.demo.util.PrintUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 2017/7/13.
 */
@Component
public class UserService implements BeanNameAware,BeanFactoryAware,InitializingBean {
    @Value("${name.user}")
    String user;

    public UserService() {
        PrintUtil.construct(UserService.class);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        PrintUtil.method(UserService.class,"setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        PrintUtil.method(UserService.class,"setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PrintUtil.method(UserService.class,"afterPropertiesSet");
    }
}
