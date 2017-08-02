package com.paulzhangcc.print;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by paul on 2017/8/1.
 */
@Configuration
public class PrintConfiguration {

    @Bean
    public PrintService printService(){
        return  new PrintService();
    }
}
