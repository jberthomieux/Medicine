package com.jackson.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jackson.dto.UserDto;
import com.jackson.model.User;
import com.jackson.repo.UserRepo;

@Service(value="userService")
public class UserService implements UserDetailsService{
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findUserByUsername(username);
		if (user == null) {
		throw new UsernameNotFoundException("Invalid username or password");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
		getAuthority(user));
		}
		
	
	private Set<SimpleGrantedAuthority> getAuthority(User user){
		Set<SimpleGrantedAuthority> authorities=new HashSet<>();
		user.getRoles().forEach(role->{
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		});
		return authorities;
	}

public List<User> findAll(){
	List<User> list=new ArrayList<>();
	userRepo.findAll().iterator().forEachRemaining(list::add);
	return list;
}
	
public void delete(int id) {
	userRepo.deleteById(id);
}
	
	public User findOne(String username) {
		return userRepo.findUserByUsername(username);
}
	
	public User findById(int id) {
		return userRepo.findById(id);
}
	
	public User save(UserDto user) {
		User newUser = new User();
		
		newUser.setUsername(user.getUsername());
		newUser.setEmail(user.getEmail());
		newUser.setId(user.getId());
		//newUser.setPassword(user.getPassword());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setName(user.getName());
		//newUser.setRoles(user.getRoles());
		return userRepo.save(newUser);

	}
}
	
	