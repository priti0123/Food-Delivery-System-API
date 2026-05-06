package com.food.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.restaurant.entity.Restaurant;

public interface IRestaurantRepository extends JpaRepository<Restaurant, Long> {

}
