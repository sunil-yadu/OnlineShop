package com.yash.shoppingmart.models;

public class ProductModel {
	

	private int id;
	private String name;
	private double price;
	private String  desc;
	

	

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", price=" + price + ", description=" + desc + "]";
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc= desc;
	}
	

	
}

