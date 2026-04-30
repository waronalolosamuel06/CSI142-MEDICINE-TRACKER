package com.ub.csimedicinetracker.model;

public class Vaccine extends Medicine {
private String manufacturer;
private double storageTemp;

 public Vaccine(String name, String batchID, String expiryDate, Stock inventory, String manufacturer, double storageTemp) {
super(name, batchID, expiryDate, inventory);
this.manufacturer = manufacturer;
 this.storageTemp = storageTemp;
                    }

@Override
public void displayDetails() {
System.out.println("--- Vaccine Details ---");
System.out.println("Name: " + getName());
System.out.println("Manufacturer: " + manufacturer);
System.out.println("Storage Temp: " + storageTemp + "°C");
System.out.println("Current Stock: " + getInventory().getQuantity());
                            }
      
 }
