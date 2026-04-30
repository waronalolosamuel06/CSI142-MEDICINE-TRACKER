package com.ub.csimedicinetracker.utility;

import com.ub.csimedicinetracker.model.Medicine;
import java.util.ArrayList;

public class RestockReport {
    public static void generate(ArrayList<Medicine> medicines) {
        System.out.println("\n--- Restock Report ---");
        for (Medicine m : medicines) {
            if (m.getInventory().isLow()) {
                System.out.println(m.getName() + " is LOW on stock!");
            }
        }
    }
}
