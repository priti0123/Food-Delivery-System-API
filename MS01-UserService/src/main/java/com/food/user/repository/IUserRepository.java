package com.food.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.user.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
	Optional<UserEntity> findByEmail(String email);
}
