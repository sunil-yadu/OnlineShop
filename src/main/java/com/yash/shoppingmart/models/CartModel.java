package com.yash.shoppingmart.models;



public class CartModel {
	
    private int id;
	private UserModel usermodel;
	
	public CartModel() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "CartModel [id=" + id + ", user=" + usermodel + "]";
	}

	public UserModel getUsermodel() {
		return usermodel;
	}

	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
