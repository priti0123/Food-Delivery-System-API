package com.food.user.service;


import com.food.user.dto.LoginRequest;
import com.food.user.dto.RegisterRequest;
import com.food.user.entity.UserEntity;


public interface IUserServiceMgmt {
	
	public String login(LoginRequest request);
	public String registerUser(RegisterRequest user);
	public UserEntity findUserByUserId(Integer userId);

}
