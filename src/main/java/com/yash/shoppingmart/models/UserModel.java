package com.yash.shoppingmart.models;

public class UserModel {

	private int id;
	private String email;
	private String name;

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", email=" + email + ", name=" + name + "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
