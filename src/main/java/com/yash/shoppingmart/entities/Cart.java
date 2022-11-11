package com.yash.shoppingmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CRT")
public class Cart {

	
	
	@Id
	@GeneratedValue
	@Column(name="CRT_ID")
	private int id;
	
    @ManyToOne
    @JoinColumn(name="USR_ID")
	private User user;
	
	public Cart() {
		super();
		
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
