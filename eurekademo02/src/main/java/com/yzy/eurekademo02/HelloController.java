package com.yzy.eurekademo02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${self.name}")
	private String name;
	@Value("${self.age}")
	private int age;

	@GetMapping("hello")
	public String HiController() {
		return "Hello " + name + ",your age is " + age;
	}
}
