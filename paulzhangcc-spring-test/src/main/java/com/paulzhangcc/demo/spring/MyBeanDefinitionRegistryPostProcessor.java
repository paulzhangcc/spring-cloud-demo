package com.paulzhangcc.demo.spring;

import com.paulzhangcc.demo.service.CustomerService;
import com.paulzhangcc.demo.util.PrintUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by paul on 2017/7/13.
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements  BeanNameAware,InitializingBean, ApplicationContextAware,BeanDefinitionRegistryPostProcessor,BeanFactoryAware {
    ApplicationContext applicationContext;

    BeanFactory beanFactory;

    public MyBeanDefinitionRegistryPostProcessor() {
        PrintUtil.construct(MyBeanDefinitionRegistryPostProcessor.class);
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {PrintUtil.method(MyBeanDefinitionRegistryPostProcessor.class,"postProcessBeanDefinitionRegistry");
        test();
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(CustomerService.class);
        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
        mutablePropertyValues.addPropertyValue("customer","hello world!");
        beanDefinition.setPropertyValues(mutablePropertyValues);
        beanDefinitionRegistry.registerBeanDefinition("zjf",beanDefinition);

    }

    private void test(){
        Map<String, PropertyResourceConfigurer> prcs = this.applicationContext.getBeansOfType(PropertyResourceConfigurer.class);
        if(!prcs.isEmpty() && this.applicationContext instanceof GenericApplicationContext) {
           GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            mutablePropertyValues.add("customer","${name.user}");

            beanDefinition.setPropertyValues(mutablePropertyValues);
            beanDefinition.setBeanClass(CustomerService.class);
            DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
            factory.registerBeanDefinition("customerService", beanDefinition);
            Iterator i$ = prcs.values().iterator();

            while(i$.hasNext()) {
                PropertyResourceConfigurer prc = (PropertyResourceConfigurer)i$.next();
                prc.postProcessBeanFactory(factory);
            }

            PropertyValues values = beanDefinition.getPropertyValues();
            PropertyValue property = values.getPropertyValue("customer");
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        PrintUtil.method(MyBeanDefinitionRegistryPostProcessor.class,"postProcessBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        PrintUtil.method(MyBeanDefinitionRegistryPostProcessor.class,"setApplicationContext");
        this.applicationContext =applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        PrintUtil.method(MyBeanDefinitionRegistryPostProcessor.class,"setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PrintUtil.method(MyBeanDefinitionRegistryPostProcessor.class,"afterPropertiesSet");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        PrintUtil.method(MyBeanDefinitionRegistryPostProcessor.class,"setBeanFactory");
        this.beanFactory = beanFactory;
    }
}
