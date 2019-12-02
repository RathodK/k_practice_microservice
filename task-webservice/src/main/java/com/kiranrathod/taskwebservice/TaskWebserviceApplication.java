package com.kiranrathod.taskwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableOAuth2Sso
@EnableCircuitBreaker
public class TaskWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskWebserviceApplication.class, args);
	}

}
