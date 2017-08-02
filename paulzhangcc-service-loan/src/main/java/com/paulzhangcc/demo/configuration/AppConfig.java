package com.paulzhangcc.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by paul on 2017/7/31.
 */
@Configuration
public class AppConfig {
    @Bean
    public LoanConfigBean loanConfigBean() {
        return new LoanConfigBean();
    }
}