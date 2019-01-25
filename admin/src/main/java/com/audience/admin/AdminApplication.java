package com.audience.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplication {
	private static final Logger logger = LoggerFactory.getLogger(AdminApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
		logger.info("admin服务启动完成");
	}
}
