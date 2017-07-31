package com.paulzhangcc.demo.vo;

import java.io.Serializable;

/**
 * Created by paul on 2017/6/29.
 */
public class UserVo implements Serializable{
    private static final long serialVersionUID = -214398360431009750L;
    private String name;
    private Integer age;
    private String mobile;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
