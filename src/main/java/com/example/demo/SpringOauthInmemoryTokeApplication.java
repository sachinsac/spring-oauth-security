package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication(scanBasePackages="com.example.*")
@EnableOAuth2Client
public class SpringOauthInmemoryTokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthInmemoryTokeApplication.class, args);
	}
}
