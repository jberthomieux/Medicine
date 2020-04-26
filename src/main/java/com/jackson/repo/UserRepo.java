package com.jackson.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jackson.dto.UserDto;

//import org.springframework.security.core.userdetails.UserDetailsService;

//import com.jackson.dto.UserDto;
import com.jackson.model.User;
public interface UserRepo extends  JpaRepository<User,Integer>{
	User save(User user);
	List<User>findAll();
	User findUserByUsername(String username);
	User findById(int id);
	void deleteById(int id);
	//User findOne(String username);
	User save(UserDto user);
	
  }
