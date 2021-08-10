package com.aisha.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aisha.os.api.Common.Payment;
import com.aisha.os.api.Common.TransactionRequest;
import com.aisha.os.api.Common.TransactionResponse;
import com.aisha.os.api.entity.Order;
import com.aisha.os.api.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest Request) {
		String message = "";
		Order order = Request.getOrder();
		Payment payment = Request.getPayment();
		payment.setOrderid(order.getId());
		payment.setAmount(order.getPrice());
		System.out.println("order object:"+order);
		//rest API Call
		//Payment paymentResponse = restTemplate.postForEntity("http://localhost:8182/payments/doPayment", payment, Payment.class);
		Payment paymentResponse = restTemplate.postForObject("http://localhost:8182/payments/doPayment", payment, Payment.class);
		message = paymentResponse.getPaymentStatus().equalsIgnoreCase("Success")?
				"Payment processing successful and order placed":
					"Something wrong happened while processing the payment";
;		if(paymentResponse.getPaymentStatus().equalsIgnoreCase("Success")) {
			repository.save(order);
		}
		 
		return new TransactionResponse(order,paymentResponse.getTransactionId(),paymentResponse.getAmount(),message);
	}

}
