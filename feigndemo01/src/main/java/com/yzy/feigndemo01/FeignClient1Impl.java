package com.yzy.feigndemo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClient1Impl {

	@Autowired
	FeignClient1 client1;

	@GetMapping("/hc")
	public String helloService() {
		return client1.helloService();
	}
}
