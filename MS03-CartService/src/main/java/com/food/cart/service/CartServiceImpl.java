package com.food.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.cart.client.MenuClient;
import com.food.cart.dto.CartItemDTO;
import com.food.cart.dto.MenuItemDTO;
import com.food.cart.entity.CartItem;
import com.food.cart.repository.CartRepository;

import jakarta.transaction.Transactional;

@Service
public class CartServiceImpl implements ICartService {

	 @Autowired
	 private CartRepository cartRepository;
	 @Autowired
	 private MenuClient menuClient;

	

	 public CartItem addItem(CartItemDTO request){

	  MenuItemDTO menuItem =
	          menuClient.getMenuItem(request.getMenuItemId());

	  CartItem item = new CartItem();

	  item.setUserId(request.getUserId());
	  item.setMenuItemId(menuItem.getId());
	  item.setQuantity(request.getQuantity());
	  item.setMenuItemName(menuItem.getName());
	  item.setPrice(menuItem.getPrice());

	  return cartRepository.save(item);
	 }

	 public List<CartItem> getUserCart(Long userId){
	  return cartRepository.findByUserId(userId);
	 }

	 @Transactional
	 public String removeItem(Long id){
	  cartRepository.deleteById(id);
	  return "Item Removed from Cart of Id :: " + id;
	 }

	 @Transactional
	 public String clearCart(Long userId){
	  cartRepository.deleteByUserId(userId);
	  return "Item Removed from of User Id :: " + userId;
	 }

}
