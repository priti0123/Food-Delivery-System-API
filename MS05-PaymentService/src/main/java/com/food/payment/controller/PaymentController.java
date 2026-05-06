package com.food.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.payment.dto.PaymentRequest;
import com.food.payment.entity.Payment;
import com.food.payment.service.IPaymentService;


@RestController
@RequestMapping("/payments-api")
public class PaymentController {

	@Autowired
    private IPaymentService service;


    @PostMapping("/doPayment")
    public Payment makePayment(@RequestBody PaymentRequest payment) {
        return service.processPayment(payment);
    }

    @GetMapping("/find/{orderId}")
    public Payment getPayment(@PathVariable Long orderId) {
        return service.getPaymentByOrderId(orderId);
    }
}