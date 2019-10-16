package com.yzy.feigndemo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	FeignClient1 client1;

	@GetMapping("/hc")
	public String hcController() {
		return client1.helloService();
	}
}
