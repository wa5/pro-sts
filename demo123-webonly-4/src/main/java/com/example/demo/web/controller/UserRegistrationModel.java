package com.example.demo.web.controller;



public class UserRegistrationModel {

	
private	String name;
private	String email;
private	String password;
public UserRegistrationModel() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserRegistrationModel [name=" + name + ", email=" + email + ", password=" + password + "]";
}
	
	
	
}
