package com.food.menu.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.food.menu.dto.MenuItemDto;
import com.food.menu.entity.MenuItem;

public interface IMenuItemService {

	   public String addMenuItem(MenuItemDto menuItem);
		public MenuItem getMenuById(Long id);
		public List<MenuItem> getAllMenuDetails();
		
}
