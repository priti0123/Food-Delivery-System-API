package com.food.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.payment.entity.Payment;

public interface IPaymentRepository extends JpaRepository<Payment, Integer> {
	Payment findByOrderId(Long orderId);
}
