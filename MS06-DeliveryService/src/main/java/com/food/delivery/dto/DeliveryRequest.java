package com.food.delivery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryRequest {

	private Long orderId;

	 private String deliveryPerson;

	 private String deliveryStatus;

	 private Integer estimatedTime;
}
