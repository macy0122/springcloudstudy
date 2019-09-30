package com.yzy.eurekademo01_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekademo01_1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekademo01_1Application.class, args);
	}

}
