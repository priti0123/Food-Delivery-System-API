package com.food.cart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class CartItem {

 @Id
 @SequenceGenerator(name="gen3" , sequenceName = "CART_SEQ" , initialValue = 1001 , allocationSize = 1)
 @GeneratedValue(generator = "gen3", strategy  = GenerationType.IDENTITY)
 private Long id;

 private Long userId;

 private Long menuItemId;
 private String menuItemName;
 private Integer quantity;
 private Double price;

}
