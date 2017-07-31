package com.paulzhangcc.demo;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayApplication {
	public static void main(String[] args) throws Exception {
	/*	String directories =
				"C:/pengrun/work/spring-cloud-mvn/paulzhangcc-gateway/src/main/java/";*/
	    String directories ="C:\\Users\\paul\\Desktop\\hello";
		FilterLoader.getInstance().setCompiler(new GroovyCompiler());
		FilterFileManager.setFilenameFilter(new GroovyFileFilter());
		FilterFileManager.init(1,directories);
		SpringApplication.run(GatewayApplication.class, args);
	}
}
