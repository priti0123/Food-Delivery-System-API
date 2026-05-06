package com.food.cart.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.food.cart.dto.MenuItemDTO;

@FeignClient(name="MenuService")
public interface MenuClient {

 @GetMapping("/menu-api/findBy/{id}")
 MenuItemDTO getMenuItem(@PathVariable Long id);

}