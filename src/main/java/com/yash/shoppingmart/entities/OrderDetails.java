package com.yash.shoppingmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDR_DTLS")
public class OrderDetails {
	
	
	@Id
	@GeneratedValue
	@Column(name="ORDR_DTLS_ID")
	private int id;
	
	@Column(name="QNTTY")
    private int quantity;
   
    @Column(name="PRDCT_NM")
	private String name;
	
	@Column(name="PRDCT_PRC")
	private double price;
    
    @Column(name="ORDR_ID")
    private int orderId;
    
    
    @Column(name="PRDCT_ID")
    private int productId;
    
    
    
    public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}



	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", quantity=" + quantity + ", name=" + name + ", price=" + price
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


    
    


}
