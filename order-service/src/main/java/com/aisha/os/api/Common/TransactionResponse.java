package com.aisha.os.api.Common;

import com.aisha.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
	private Order order;
	private String transactionId;
	private double amount;
	private String message;
	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", transactionId=" + transactionId + ", amount=" + amount + "]";
	}
	
}
