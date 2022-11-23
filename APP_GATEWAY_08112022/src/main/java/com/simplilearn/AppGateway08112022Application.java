package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGateway08112022Application {

	public static void main(String[] args) {
		SpringApplication.run(AppGateway08112022Application.class, args);
	}

}
