package com.kiranrathod.commentswebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableOAuth2Sso
@SpringBootApplication
public class CommentsWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentsWebserviceApplication.class, args);
	}

}
