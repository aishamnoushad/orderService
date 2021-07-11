package com.aisha.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.os.api.entity.Order;
import com.aisha.os.api.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService service;
	@RequestMapping(value="/bookorder",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Order bookOrder(@RequestBody Order orderobj) {
		System.out.println(orderobj.toString());
		return service.saveOrder(orderobj);
	}
}
