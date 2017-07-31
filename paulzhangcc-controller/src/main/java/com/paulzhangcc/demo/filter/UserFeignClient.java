package com.paulzhangcc.demo.filter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.paulzhangcc.demo.filter.UserFeignClient.SERVICE_NAME;

/**
 * Created by paul on 2017/6/29.
 */
@FeignClient(SERVICE_NAME)
public interface UserFeignClient {
    String SERVICE_NAME = "service-user";

    @RequestMapping(value = "/sys/user/get",method = RequestMethod.GET)
    String get();
}
