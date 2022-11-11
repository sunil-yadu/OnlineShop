package com.yash.shoppingmart.models;



public class OrderModel {
    
    private int id;
       private int cartmodel;
       private double amount;
       
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getCartmodel() {
        return cartmodel;
    }
    public void setCartmodel(int cartmodel) {
        this.cartmodel = cartmodel;
    }
    
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "OrderModel [id=" + id + ", cartmodel=" + cartmodel + ", amount=" + amount + "]";
    }
    



   
    
    
    
    



}