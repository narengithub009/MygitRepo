package com.java.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.java.demo.dao.OrderDao;
import com.java.demo.model.Order;
import com.java.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;
	@Override
	public Order saveOrders(Order order) {
		
		return orderDao.save(order);
	}
	@Override
	public double getPrice(String productName) {
		Order order=orderDao.findByName(productName);
		
		return order.getPrice();
	}

	
}
