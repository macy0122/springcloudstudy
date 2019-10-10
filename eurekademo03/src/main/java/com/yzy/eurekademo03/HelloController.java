package com.yzy.eurekademo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
	@LoadBalanced
	RestTemplate restTemplate;

	@GetMapping("hi")
	public String HiController() {
		return restTemplate.getForEntity("http://EUREKA-SERVER/hello", String.class).getBody();
	}
}
