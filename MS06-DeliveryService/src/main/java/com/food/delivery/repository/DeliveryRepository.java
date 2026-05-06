package com.food.delivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.delivery.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
	
	 Optional<Delivery> findByOrderId(Long orderId);

}
