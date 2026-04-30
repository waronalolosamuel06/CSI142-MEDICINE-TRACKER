package com.ub.csimedicinetracker.model;

public class Stock {
    private int quantity;
    private int minThreshold;

 public Stock(int quantity, int minThreshold){
    this.quantity = quantity;
    this.minThreshold = minThreshold;
 }
    
  public void addStock(int amount){
    if (amount > 0) {
        this.quantity += amount;
    }
 }
 public void removeStock (int amount){
   
    if (amount > 0 && amount <= this.quantity){
        this.quantity -= amount;
    } else{ System.out.println("Error insufficient stock or invalid amount.");
     }
 }
    public boolean isLow(){
    return this.quantity < this.minThreshold;
  }

 public int getQuantity(){
    return quantity;
 }
  public int getMinThreshold(){
    return minThreshold;
  }
}
