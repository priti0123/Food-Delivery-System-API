package com.food.delivery.service;

import com.food.delivery.dto.DeliveryRequest;
import com.food.delivery.entity.Delivery;

public interface IDeliveryService {
    
	public Delivery assignDelivery(DeliveryRequest request); 
	public Delivery updateStatus(Long orderId,String status);
	public Delivery trackDelivery(Long orderId);
}
