package com.yzy.zuuldemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulProxy
@SpringCloudApplication
public class Zuuldemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Zuuldemo01Application.class, args);
	}

}
