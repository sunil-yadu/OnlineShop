package com.yash.shoppingmart.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="ORDR")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ORDR_ID")
    private int id;
    
    @ManyToOne
    @JoinColumn(name="USR_ID")
    private User user;
   
    



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



@Override
public String toString() {
	return "Order [id=" + id + ", user=" + user + "]";
}


    
    



}