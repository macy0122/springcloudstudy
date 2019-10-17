package com.yzy.feigndemo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	FeignClient1 client1;

	@GetMapping("/hc")
	public String hcController() {
		return client1.helloService();
	}

	@GetMapping("/hc1")
	public User hc1Controller() {
		return client1.hello1Service("Mac",22);
	}

	@PostMapping("/hc2")
	public String hc2Controller() {
		return client1.hello2Service(new User("Rose", 18));
	}
}
