package com.paulzhangcc.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.paulzhangcc.print.EnablePrint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
@EnablePrint
public class ServiceLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceLoanApplication.class, args);
	}
}
