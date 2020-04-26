package com.jackson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.dto.UserDto;
import com.jackson.model.User;
import com.jackson.service.UserService;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class UserController {
@Autowired
private UserService userService;

@PreAuthorize("hasRole('ADMIN')")
@RequestMapping(value="/users",method=RequestMethod.GET)
public List<User> listUser(){
	return userService.findAll();
}

	@PreAuthorize("hasRole('USER')")
	@RequestMapping(value="/user/{id}",method= RequestMethod.GET)
	public User getOne(@PathVariable(value="id") int id) {
		return userService.findById(id);
		
	}
	@RequestMapping(value="/signup",method= RequestMethod.POST)
	public User saveUser(@RequestBody UserDto user) {
		return userService.save(user);
		
	}
}
