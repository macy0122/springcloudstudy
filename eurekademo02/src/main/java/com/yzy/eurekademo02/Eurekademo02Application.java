package com.yzy.eurekademo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekademo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekademo02Application.class, args);
	}

}
