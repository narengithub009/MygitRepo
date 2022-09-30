package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringBootJenkinscicdDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinscicdDockerApplication.class, args);
	}
	@GetMapping("/msg")
	public String greeting() {
		return "welcome to Docker world !!!!!!!!!!!!!!!!";
	}
	
}
