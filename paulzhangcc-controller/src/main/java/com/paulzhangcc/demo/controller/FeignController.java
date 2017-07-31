package com.paulzhangcc.demo.controller;

import com.paulzhangcc.demo.filter.LoanFeignClient;
import com.paulzhangcc.demo.filter.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    UserFeignClient userFeignClient;

    @Autowired
    LoanFeignClient loanFeignClient;

    @GetMapping("/feign/loan")
    String loan() {
       return loanFeignClient.get();
    }

    @GetMapping("/feign/user")
    String user() {
        return userFeignClient.get();
    }

}