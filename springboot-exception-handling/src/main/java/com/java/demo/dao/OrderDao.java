package com.java.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demo.model.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

	Order findByName(String productName);

}
