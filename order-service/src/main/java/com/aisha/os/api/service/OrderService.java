package com.aisha.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aisha.os.api.entity.Order;
import com.aisha.os.api.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public Order saveOrder(Order objorder) {
		return repository.save(objorder);
	}

}
