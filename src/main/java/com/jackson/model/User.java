package com.jackson.model;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column
private String name;
@Column
private String username;
@Column
private String password;
@Column
private String email;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinTable(name="USER_ROLES",joinColumns= {
@JoinColumn(name="USER_ID")},inverseJoinColumns= {
@JoinColumn(name="ROLE_ID")})
//@OneToMany(targetEntity = Role.class, cascade = CascadeType.ALL)
//@JoinColumn(name="user_fk", referencedColumnName = "id")
private Set<Role> roles;

public User(int id, String name, String username, String password, String email, Set<Role> roles) {
	super();
	this.id = id;
	this.name = name;
	this.username = username;
	this.password = password;
	this.email = email;
	this.roles = roles;
}
public User() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Set<Role> getRoles() {
	return roles;
}
public void setRoles(Set<Role> roles) {
	this.roles = roles;
}
}
