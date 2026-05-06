package com.food.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="USER")
public class UserEntity {
	
	@Id
	@SequenceGenerator(name="gen1" , sequenceName = "UID_SEQ" , initialValue = 10000 , allocationSize = 1)
    @GeneratedValue(generator="gen1" , strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NonNull
	@Column(length=30)
	private String name;
	
	@NonNull
	@Column(length=100)
    private String email;
	
	@NonNull
	@Column(length=200)
	private String password;
	
	@NonNull
	@Column(length=12)
	private String phone;
	
	@NonNull
	@Column(length=30)
	private String role;

}
