package com.yzy.eurekademo03;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	/**
	 * @title:
	 * @description: hystrix熔断器
	 * @param: []
	 * @return: java.lang.String
	 */
	@HystrixCommand(fallbackMethod = "helloFallback")
	public String sayHello() {
		return restTemplate.getForEntity("http://EUREKA-SERVER/hello", String.class).getBody();
	}

	public String helloFallback() {
		return "error";
	}
}

