package com.paulzhangcc.demo.configuration;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by paul on 2017/7/31.
 */
public class LoanConfigBean{
    @Value("${name:default}")
    private String name;
    @Value("${port:0}")
    private Integer port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "LoanConfigBean{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
