package com.server.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.service.CartService;



@RestController
@RequestMapping("/cart-api")
public class CartController {

	@Autowired
	private CartService service;

     @GetMapping("/cart")
     public String getCartDetails() {
               
    	      String result =   service.showDetails();
              return result;
    }
}