package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootJobschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJobschedulerApplication.class, args);
	}

}
