package com.paulzhangcc.demo.spring;

import com.paulzhangcc.demo.util.PrintUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 2017/7/13.
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        PrintUtil.construct(MyBeanFactoryPostProcessor.class);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        PrintUtil.method(MyBeanFactoryPostProcessor.class,"postProcessBeanFactory");


    }
}
