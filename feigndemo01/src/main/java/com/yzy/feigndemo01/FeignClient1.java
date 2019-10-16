package com.yzy.feigndemo01;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-server")
public interface FeignClient1 {

	@GetMapping("/hello")
	String helloService();
}
