package com.food.delivery.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.dto.DeliveryRequest;
import com.food.delivery.entity.Delivery;
import com.food.delivery.repository.DeliveryRepository;

@Service
public class DeliveryServiceImpl implements IDeliveryService {
	
     @Autowired
	 private  DeliveryRepository deliveryRepository;

	 public Delivery assignDelivery(DeliveryRequest request){
	        Delivery delivery = new Delivery();
	        BeanUtils.copyProperties(request, delivery);
	       delivery.setDeliveryStatus("ASSIGNED");

	       return deliveryRepository.save(delivery);
	 }

	 public Delivery updateStatus(Long orderId,String status){

	  Delivery delivery =
	          deliveryRepository.findByOrderId(orderId)
	                  .orElseThrow();
	  delivery.setDeliveryStatus(status);
	  return deliveryRepository.save(delivery);
	 }

	 public Delivery trackDelivery(Long orderId){
	  return deliveryRepository.findByOrderId(orderId)
	          .orElseThrow();
	 }
}


