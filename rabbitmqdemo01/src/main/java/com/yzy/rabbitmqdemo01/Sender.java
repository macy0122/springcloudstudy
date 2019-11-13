package com.yzy.rabbitmqdemo01;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Autowired
	private AmqpTemplate rabbittemplate;

	public void sendMsg(String msg) {
		rabbittemplate.convertAndSend("hello", "Sender: Hello " + msg);
	}
}
