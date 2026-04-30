package com.ub.csimedicinetracker.model;

public class GeneralMedication extends Medicine {
        private String dosageForm;

                           public GeneralMedication(String name, String batchID, String expiryDate, Stock inventory, String dosageForm) {
                            super(name, batchID, expiryDate, inventory);
                                    this.dosageForm = dosageForm;
                }

                    @Override
                        public void displayDetails() {
                                    System.out.println("--- Medication Details ---");
                                            System.out.println("Name: " + getName());
                                                    System.out.println("Form: " + dosageForm);
                                                            System.out.println("Current Stock: " + getInventory().getQuantity());
                        }
}

                        
                
