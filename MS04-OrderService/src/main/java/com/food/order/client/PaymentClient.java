package com.food.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.food.order.dto.PaymentRequest;

@FeignClient("PaymentService")
public interface PaymentClient {
	
	@PostMapping("/payments-api/doPayment")
	public void processPayment(@RequestBody PaymentRequest req);

}
