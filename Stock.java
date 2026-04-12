package com.ub.csimedicinetracker.model;

public class Stock {
    private int quantity;
    private int minThreshold;

 //constructor
 public Stock(int quantity, int minThreshold){
    this.quantity = quantity;
    this.minThreshold = minThreshold;
 }
    
 //methods
 public void addStock(int amount){
    if (amount > 0) {
        this.quantity += amount;
    }
 }

 public void removeStock (int amount){
    //validation
    if (amount > 0 && amount <= this.quantity){
        this.quantity -= amount;
    } else{ System.out.println("Error insufficient stock or invalid amount.");
     }
 }
  //return true if current quantity is low
  public boolean isLow(){
    return this.quantity < this.minThreshold;
  }
 //getters
 public int getQuantity(){
    return quantity;
 }
  public int getMinThreshold(){
    return minThreshold;
  }
}
