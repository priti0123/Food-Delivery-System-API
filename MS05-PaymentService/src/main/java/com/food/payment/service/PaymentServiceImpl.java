package com.food.payment.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.payment.dto.PaymentRequest;
import com.food.payment.entity.Payment;
import com.food.payment.kafka.PaymentProducer;
import com.food.payment.repository.IPaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {
	
	@Autowired
    private IPaymentRepository repository;
	@Autowired
    private PaymentProducer producer;

    

    public Payment processPayment(PaymentRequest payment) {

    	Payment payEntity = new Payment();
    	BeanUtils.copyProperties(payment, payEntity);
        payEntity.setStatus("SUCCESS");

        Payment savedPayment = repository.save(payEntity);

        producer.sendPaymentEvent(
            "Payment successful for Order ID: " + payment.getOrderId()
        );

        return savedPayment;
    }

    public Payment getPaymentByOrderId(Long orderId) {
        return repository.findByOrderId(orderId);
    }
}


