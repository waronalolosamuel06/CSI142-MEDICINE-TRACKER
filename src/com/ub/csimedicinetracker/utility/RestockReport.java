

package com.ub.csimedicinetracker.utility;

import com.ub.csimedicinetracker.model.*;
import java.util.List;

public class Restockreport {

    private List<Medicine> inventory;

    public Restockreport(List<Medicine> inventory) {
        this.inventory = inventory;

    }

    public void printLowStockReport() {
        boolean found = false;

        for (Medicine m : inventory) {
            if (m.getInventory().isLow()) {
                m.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No medicines are low on stock.");
        }
    }

    public void printExpiryReport() {
        boolean found = false;

        for (Medicine m : inventory) {
            if (m.getInventory().isLow()) {
                m.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expired medicines found.");
        }
    }
}
