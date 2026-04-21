import java.util.List;

public class RestockReport {

    private List<Medicine> inventory;

    public RestockReport(List<Medicine> inventory) {
        this.inventory = inventory;

    }

    public void printLowStockReport() {
        boolean found = false;

        for (Medicine m : inventory) {
            if (m.isLowStock()) {
                m.displayInfo();
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
            if (m.isExpired()) {
                m.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expired medicines found.");
        }
    }
}
