package com.yzy.eurekademo02_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekademo02_1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekademo02_1Application.class, args);
	}

}
