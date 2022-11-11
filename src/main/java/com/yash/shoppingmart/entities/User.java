package com.yash.shoppingmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USR_DM")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="USR_ID")
	private int id;
	
	@Column(name="USR_EML")
	private String email;
	

	public User() {
		
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + "]";
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


	@Column(name="USR_NM")
	private String name;

}
