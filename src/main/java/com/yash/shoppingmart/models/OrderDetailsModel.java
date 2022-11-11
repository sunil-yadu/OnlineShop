package com.yash.shoppingmart.models;


public class OrderDetailsModel {
	
    private int id;
    private int quantity;
	private String name;
	private double price;
    private int orderId;
    private int productId;
    
    
	@Override
	public String toString() {
		return "OrderDetailsModel [id=" + id + ", quantity=" + quantity + ", name=" + name + ", price=" + price
				+ ", orderId=" + orderId + ", productId=" + productId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
    

}
