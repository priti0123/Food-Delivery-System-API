package com.server.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("RestaurantService")
public interface RestaurantClient {
	   
	 @GetMapping("/restaurant-api/menu")
       public String getMenu();
} 
