package com.food.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.menu.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
