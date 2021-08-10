package com.aisha.os.api.Common;

import com.aisha.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
	private Order order;
	private Payment payment;
	@Override
	public String toString() {
		return "TransactionRequest [order=" + order + ", payment=" + payment + "]";
	}
	
}
