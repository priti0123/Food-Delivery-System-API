package com.food.payment.service;

import com.food.payment.dto.PaymentRequest;
import com.food.payment.entity.Payment;

public interface IPaymentService {
	
	public Payment processPayment(PaymentRequest payment) ;
    public Payment getPaymentByOrderId(Long orderId);

}
