package com.paulzhangcc.demo;

import com.paulzhangcc.demo.service.LoanService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		long l = new BigDecimal("1.23").subtract(new BigDecimal("1.01")).longValue();
		System.out.println(l);

		SpringApplication.run(SpringTestApplication.class, args);

		Object zjf = LoanService.context.getBean("zjf");
		System.out.println(zjf);

	}
}
