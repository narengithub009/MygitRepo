package com.java.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.java.demo.dao.UserDao;
import com.java.demo.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Scheduled(fixedRate = 5000)
	public void saveToDB() {
		
		User user =new User();
		user.setName("records" + new Random().nextInt(232323));
		dao.save(user);
		
		System.out.println("Add service call in "+new Date().toString());
		
	}
	
	@Scheduled(cron = "0/15 * * * * *")
	public void fetchRecords() {
		
		List<User> users=dao.findAll();
		System.out.println("Fetch service call in "+new Date().toString());
		System.out.println("number of records fetched "+users.size());
		
		log.info("users : {}", users);
	}
}
