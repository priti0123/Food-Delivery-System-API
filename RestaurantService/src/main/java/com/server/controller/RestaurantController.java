package com.server.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant-api")
public class RestaurantController {

 Random random = new Random();

     @GetMapping("/menu")
     public String getMenu() {
               
              return "Menu : Pizza , Burger , Pasta , Noodles";
    }
}