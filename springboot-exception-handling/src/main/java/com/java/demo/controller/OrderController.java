package com.java.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.model.Order;
import com.java.demo.service.OrderService;

@RestController
@RequestMapping("api/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping()
	public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.saveOrders(order), HttpStatus.CREATED);
			
	}
	
	@GetMapping("{productName}")
	public String getPrice(@PathVariable("productName") String productName) {
		
		double price=orderService.getPrice(productName);
		return "The amount of " +productName+" is "+price;
		
	}
}
