package com.paulzhangcc.demo.spring;

import com.paulzhangcc.demo.service.LoanService;
import com.paulzhangcc.demo.util.PrintUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * Created by paul on 2017/7/13.
 */
@Component
public class MyInstantiationAwareBeanPostProcessorAdapter extends InstantiationAwareBeanPostProcessorAdapter {
    public MyInstantiationAwareBeanPostProcessorAdapter() {
        PrintUtil.construct(MyInstantiationAwareBeanPostProcessorAdapter.class);
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        PrintUtil.method(MyInstantiationAwareBeanPostProcessorAdapter.class,"postProcessBeforeInstantiation");
        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        PrintUtil.method(MyInstantiationAwareBeanPostProcessorAdapter.class,"postProcessAfterInitialization");

        if (bean instanceof LoanService){
            System.out.println("================[postProcessAfterInitialization]"+((LoanService)bean).getUserService());
        }
        return super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        PrintUtil.method(MyInstantiationAwareBeanPostProcessorAdapter.class,"postProcessPropertyValues");
        if (bean instanceof LoanService){
            System.out.println("================[postProcessPropertyValues]"+((LoanService)bean).getUserService());
        }
        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }
}
