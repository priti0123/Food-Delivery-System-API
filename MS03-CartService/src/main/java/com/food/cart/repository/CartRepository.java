package com.food.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.food.cart.entity.CartItem;

import jakarta.transaction.Transactional;

public interface CartRepository extends JpaRepository<CartItem, Long> {

	 List<CartItem> findByUserId(Long userId);
	 
	 @Modifying
	 @Transactional
	 @Query("DELETE FROM CartItem c WHERE c.userId = :userId")
	 void deleteByUserId(Long userId);
	
	   
}
