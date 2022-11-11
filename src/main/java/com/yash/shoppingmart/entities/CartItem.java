package com.yash.shoppingmart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CRT_ITM")
public class CartItem {
	
	@Id
	@GeneratedValue
	@Column(name="CRT_ITM_ID")
	private int id;
	
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="CRT_ID")
	private Cart cart;
    
    @Column(name="QNTTY")
    private int quantity;
    
    @OneToOne
    @JoinColumn(name="PRDCT_ID")
    private Product product;


	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "CartItem [id=" + id + ", cart=" + cart + ", quantity=" + quantity + ", product=" + product
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
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
