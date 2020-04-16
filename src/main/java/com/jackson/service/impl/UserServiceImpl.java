//package com.jackson.service.impl;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.jackson.dao.UserDao;
//import com.jackson.model.User;
//import com.jackson.model.UserDto;
////import com.jackson.model.Role;
//import com.jackson.service.UserService;
//
//
//
//
//@Service(value="userService")
//public class UserServiceImpl implements UserDetailsService, UserService{
//	@Autowired
//	private UserDao userDao;
////	@Autowired
////	private BCryptPasswordEncoder bcryptEncoder;
//	
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		User user = userDao.findUserByUsername(username);
////		if (user == null) {
////		throw new UsernameNotFoundException("Invalid username or password");
////		}
////		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
////		getAuthority(user));
////		}
//		
//	
////	private Set<SimpleGrantedAuthority> getAuthority(User user){
////		Set<SimpleGrantedAuthority> authorities=new HashSet<>();
////		user.getRoles().forEach(role->{
////			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
////		});
////		return authorities;
////	}
//	@Autowired
//	public List<User> findAll(){
//		List<User> list=new ArrayList<>();
//		userDao.findAll().iterator().forEachRemaining(list::add);
//		return list;
//	}
//		
//	public void delete(long id) {
//		 userDao.deleteById(id);
//	}
//		
//		public User findOne(String username) {
//			return userDao.findUserByUsername(username);
//	}
//		
//		public User findById(Long id) {
//			return userDao.findById(id).get();
//	}
//		
//		public User save(UserDto user) {
//			User newUser = new User();
//			newUser.setName(user.getName());
//			newUser.setUsername(user.getUsername());
//			newUser.setPassword(user.getPassword());
//			//newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//			newUser.setEmail(user.getEmail());
//			return userDao.save(newUser);
//
//		}
//
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//	
//	