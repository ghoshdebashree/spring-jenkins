package com.example.cicdwithjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdwithjenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(CicdwithjenkinsApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing ....");
		logger.info("Test case executing second log statement ...");
		assertEquals(true,true);
	}

}
