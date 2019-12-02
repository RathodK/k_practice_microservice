package com.kiranrathod.webportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebPortalApplication.class, args);
	}

}
