package com.paulzhangcc.demo.controller;

import com.paulzhangcc.demo.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public static final String URL_BASE = Prefix.URL_SYSTEM + "/user";

    @GetMapping(UserController.URL_BASE+"/get")
    public UserVo get() {
        UserVo userVo = new UserVo();
        userVo.setAge(18);
        userVo.setMobile("10086");
        userVo.setName("张帅哥");
        return userVo;
    }

}