package com.food.menu.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDto implements Serializable{

	
    private String name;
    private String description;
    private Double price;
    private Boolean available;
    
    private Long restaurantId;
   
}
