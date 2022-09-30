package com.java.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringBootK8sDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootK8sDemoApplication.class, args);
	}
	@GetMapping("/msg")
	public String greeting() {
		System.out.println("welcome to Kubernates  world !!!!!!!!!!!!!!!! successfully deployed"+new Date());
		return "welcome to Kubernates  world !!!!!!!!!!!!!!!! successfully deployed";
	}
}
