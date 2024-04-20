package com.example.cicdwithjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.*;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdwithjenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(CicdwithjenkinsApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Application started .....");
	}

	public static void main(String[] args) {
		logger.info("Application executed .....");
		SpringApplication.run(CicdwithjenkinsApplication.class, args);
	}

}
