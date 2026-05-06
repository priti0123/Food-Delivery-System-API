package com.food.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.order.entity.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem,Long>  {
	
	List<OrderItem>  findAllByOrderId(Long orderId);

}
