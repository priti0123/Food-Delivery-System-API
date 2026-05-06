package com.food.payment.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class PaymentProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

    public void sendPaymentEvent(String message) {
        kafkaTemplate.send("payment-topic", message);
    }

}
