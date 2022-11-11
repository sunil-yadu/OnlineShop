package com.yash.shoppingmart.models;


public class CartItemModel {
	
	private int itemid;
	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	private int cartID;
	private int quantity;
    private int productID;
	
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

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "CartItemModel [itemid=" + itemid + ", cartID=" + cartID + ", quantity=" + quantity + ", productID=" + productID
				+ "]";
	}


    
    

}
