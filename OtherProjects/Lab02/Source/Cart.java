package defaultpackage;

public class Cart {
    public static final int MAX_ORDER_NUMBER = 20;
    private DigitalVideoDisc[] orderedItem = new DigitalVideoDisc[MAX_ORDER_NUMBER];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_ORDER_NUMBER) {
            System.out.println("Cart is full");
        } else {
            orderedItem[qtyOrdered] = disc; 
            qtyOrdered++;  
            System.out.println("Disc added successfully");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (orderedItem[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    orderedItem[j] = orderedItem[j + 1];
                }
                orderedItem[qtyOrdered - 1] = null;  
                qtyOrdered--;  
                System.out.println("Item removed successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Can't find item");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += orderedItem[i].getCost();  
        }
        return total;
    }
}
