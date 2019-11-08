package com.yzy.configclient1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClient {
	@Value("${from}")
	private String from;

	@GetMapping("fm")
	public String getFrom() {
		return this.from;
	}
}
