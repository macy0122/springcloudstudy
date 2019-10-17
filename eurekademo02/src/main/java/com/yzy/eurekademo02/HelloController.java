package com.yzy.eurekademo02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	@Value("${self.name}")
	private String name;
	@Value("${self.age}")
	private int age;

	@GetMapping("hello")
	public String HiController() {
		System.out.println("===========com.yzy.eurekademo02-HiController=============");
		return "Hello " + name + ",your age is " + age;
	}

	@GetMapping("hello1")
	public User Hello1Controller(@RequestParam("name") String name,@RequestParam("age") int age) {
		System.out.println("===========com.yzy.eurekademo02--Hello1Controller=============");
		return new User(name,age);
	}

	@PostMapping("hello2")
	public String Hello2Controller(@RequestBody User user) {
		System.out.println("===========com.yzy.eurekademo02--Hello2Controller=============");
		return "Hello "+user.getName()+" ,age="+user.getAge();
	}
}
