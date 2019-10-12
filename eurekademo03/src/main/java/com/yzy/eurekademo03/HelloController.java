package com.yzy.eurekademo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@GetMapping("hi")
	public String HiController() {
		return helloService.sayHello();
	}
}
