package com.paulzhangcc.demo.util;

/**
 * Created by paul on 2017/7/13.
 */
public class PrintUtil {
    public static void construct(Class clazz){
        System.out.println(String.format("执行类[%s]构造方法", clazz.getSimpleName()));
    }

    public static void method(Class clazz,String methodName){
        System.out.println(String.format("执行类[%s]的方法[%s]", clazz.getSimpleName(),methodName));
    }
}
