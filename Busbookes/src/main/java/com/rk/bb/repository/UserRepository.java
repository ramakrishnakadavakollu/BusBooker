package com.rk.bb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.bb.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String name);
	
	List<User> findByRole(String role);
	
}
