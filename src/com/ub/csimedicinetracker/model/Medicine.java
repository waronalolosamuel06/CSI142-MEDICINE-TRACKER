package com.ub.csimedicinetracker.model;

/* the medicine class is the abstract fpr all inventory items.
uses composition by holding stock object */

public abstract class Medicine{ // encapsulated fields
    private String name;
    private String batchID;
    private String expiryDate; // format YYYY/MM
    private Stock inventory; // medicine has a Stock

    //Constructor
    public Medicine(String name, String batchID, String expiryDate, Stock inventory){
          this.name = name;
          this.batchID = batchID;
          this.expiryDate = expiryDate;
          this.inventory = inventory;

    }

    //Abstract method
    public abstract void displayDetails();
    
    //check if medicine is expired
    public boolean isExpired(String todayDate){
        //
        return this.expiryDate.compareTo(todayDate) <= 0;
    }
    
    //getters to access private data
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