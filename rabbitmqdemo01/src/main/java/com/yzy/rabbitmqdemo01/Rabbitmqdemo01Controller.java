package com.yzy.rabbitmqdemo01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class Rabbitmqdemo01Controller {

	@Autowired
	private Sender sender;

	@GetMapping("/send")
	public void fun() {
		log.info("---------------sendMsg()-----------------");
		 sender.sendMsg("Jack!");
	}

}
