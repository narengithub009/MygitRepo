package com.java.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.dao.OrderDao;
import com.java.demo.model.Order;


public interface OrderService {
	
	Order saveOrders(Order order);
	
	double getPrice(String productName);
	

}
