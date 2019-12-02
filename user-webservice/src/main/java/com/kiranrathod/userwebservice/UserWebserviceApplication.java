package com.kiranrathod.userwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableOAuth2Sso
public class UserWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserWebserviceApplication.class, args);
	}

}
