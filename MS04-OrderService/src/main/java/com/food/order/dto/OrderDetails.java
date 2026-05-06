package com.food.order.dto;

import java.util.List;

import com.food.order.entity.OrderItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
	
	 private Long Orderid;
	 private Integer userId;
	 private Double totalAmount;
	 
	 private List<OrderItem> orderItems; 
	
}
