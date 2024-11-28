package pack;

import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
    public final static int MAX_NUMBERS_ORDERED = 20;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
            System.out.println("Current cart: " + itemsOrdered.size() + " discs");
        } else {
            System.out.println("The cart is full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() == 0) {
            System.out.println("The cart is empty");
        } else {
            itemsOrdered.remove(disc);
            System.out.println("The disc has been removed");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }
    
    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items: ");
    	int i = 0;
    	for (DigitalVideoDisc disc : itemsOrdered) {
    		String title = disc.getTitle();
    		String director = disc.getDirector();
    		String category = disc.getCategory();
    		int length = disc.getLength();
    		float cost = disc.getCost();
    		System.out.println(++i + ".DVD - [" + title + "] - [" + category + "] - [" + director + "] - [" 
    				+ length + "]: [" + cost + "]");
    	}
    	System.out.println("Total cost: $" + this.totalCost());
    	System.out.println("***************************************************");
    }

    public void searchCart(DigitalVideoDisc disc){
        String title = disc.getTitle();
        for (DigitalVideoDisc item : itemsOrdered){
            String title2 = item.getTitle();
            if (title == title2){
                System.out.println("DVD found");
                return;
            }
        }
        System.out.println("Can't find DVD");
    }
}
