package com.yzy.feigndemo01;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-server")
public interface FeignClient1 {

	@GetMapping("/hello")
	String helloService();

	@GetMapping("/hello1")
	User hello1Service(@RequestParam("name") String name,@RequestParam("age") int age);

	@PostMapping("/hello2")
	String hello2Service(@RequestBody User user);

}
