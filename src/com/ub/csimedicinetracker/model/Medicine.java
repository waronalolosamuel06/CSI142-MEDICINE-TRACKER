package com.ub.csimedicinetracker.model;

public abstract class Medicine{ 
    private String name;
    private String batchID;
    private String expiryDate;
    private Stock inventory; 
   
    public Medicine(String name, String batchID, String expiryDate, Stock inventory){
          this.name = name;
          this.batchID = batchID;
          this.expiryDate = expiryDate;
          this.inventory = inventory;

    }

    public abstract void displayDetails();
    
   
    public boolean isExpired(String todayDate){
      
        return this.expiryDate.compareTo(todayDate) <= 0;
    }
    
    public String getName(){
        return name;
    }

    public String getBatchID(){
        return batchID;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public Stock getInventory(){
        return inventory;
    }

}