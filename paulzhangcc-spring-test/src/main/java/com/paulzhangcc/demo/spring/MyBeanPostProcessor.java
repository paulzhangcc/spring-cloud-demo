package com.paulzhangcc.demo.spring;

import com.paulzhangcc.demo.util.PrintUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 2017/7/13.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    private static final String className = MyBeanPostProcessor.class.getName();

    public MyBeanPostProcessor() {
        PrintUtil.construct(MyBeanPostProcessor.class);
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        PrintUtil.method(MyBeanPostProcessor.class,"postProcessBeforeInitialization"+":"+o.getClass().getSimpleName()+":"+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        PrintUtil.method(MyBeanPostProcessor.class,"postProcessAfterInitialization"+":"+o.getClass().getSimpleName()+":"+s);
        return o;
    }
}
