package com.yzy.configclient1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigClient1ApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(new ConfigClient().getFrom());
	}

}
