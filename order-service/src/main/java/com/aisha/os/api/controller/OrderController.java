package com.aisha.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.os.api.entity.order;
import com.aisha.os.api.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService service;
	@PostMapping("/bookorder")
	public order bookOrder(@RequestBody order orderobj) {
		return service.saveOrder(orderobj);
	}
}
