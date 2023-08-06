package com.kengo.modal;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	public User(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.setEmail(email);
		this.setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
