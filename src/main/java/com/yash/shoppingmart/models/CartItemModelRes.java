package com.yash.shoppingmart.models;

import com.yash.shoppingmart.entities.Product;

public class CartItemModelRes {
	
	private int itemid;
	private int cartID;
	private int quantity;
    private Product product;
	
	
	@Override
	public String toString() {
		return "CartItemModelRes [itemid=" + itemid + ", cartID=" + cartID + ", quantity=" + quantity + ", product="
				+ product + "]";
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
