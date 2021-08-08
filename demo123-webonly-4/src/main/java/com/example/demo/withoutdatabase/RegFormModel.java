package com.example.demo.withoutdatabase;

public class RegFormModel {

	private String name;
	private String email;
	private String password;
	public RegFormModel() {
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
		return "RegFormModel [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
