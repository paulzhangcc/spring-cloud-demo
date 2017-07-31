package com.paulzhangcc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paul on 2017/6/29.
 */
@RestController
public class RedisController {

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/redis/get")
    public String get(){
        applicationContext.getBean(RedisProperties.class);
        return "";
    }
}
