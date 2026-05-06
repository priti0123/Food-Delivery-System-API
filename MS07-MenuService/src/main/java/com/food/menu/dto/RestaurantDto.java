package com.food.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDto {
       
	    private Long restaurantId;
	    private String name;
	    private String location;
	    private Double rating;
}
