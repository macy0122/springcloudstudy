package com.yzy.feigndemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Feigndemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Feigndemo01Application.class, args);
	}

}
