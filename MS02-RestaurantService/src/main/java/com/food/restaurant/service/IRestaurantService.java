package com.food.restaurant.service;

import java.util.List;

import com.food.restaurant.dto.RestaurantDto;
import com.food.restaurant.entity.Restaurant;

public interface IRestaurantService {

	public Restaurant addRestaurant(RestaurantDto restaurant);
    public List<Restaurant> getAllRestaurants();
    public Restaurant getRestaurant(Long id);
}
