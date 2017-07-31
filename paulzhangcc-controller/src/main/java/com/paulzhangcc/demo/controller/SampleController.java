package com.paulzhangcc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/loan")
    String loan() {
        return restTemplate.getForObject("http://service-loan:20000/sys/loan/get",String.class);
    }

    @GetMapping("/user")
    String user() {
        return restTemplate.getForObject("http://service-user:30000/sys/user/get",String.class);
    }

}