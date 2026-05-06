package com.food.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.food.delivery.dto.DeliveryRequest;
import com.food.delivery.entity.Delivery;
import com.food.delivery.service.IDeliveryService;

@RestController
@RequestMapping("/delivery-api")
public class DeliveryController {

	 @Autowired
     private  IDeliveryService deliveryService;
  
     @PostMapping("/assign")
     public ResponseEntity<Delivery> assignDelivery(@RequestBody DeliveryRequest request){
            Delivery d  = deliveryService.assignDelivery(request);
            return new ResponseEntity<Delivery>(d , HttpStatus.OK);
     }

     @PutMapping("/status/{orderId}")
     public Delivery updateStatus(@PathVariable Long orderId,
                              @RequestParam String status){
               return deliveryService.updateStatus(orderId,status);
      }

     @GetMapping("/track/{orderId}")
      public Delivery trackDelivery(@PathVariable Long orderId){
            return deliveryService.trackDelivery(orderId);
      }

}
