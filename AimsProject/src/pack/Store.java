package pack;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc disc){
        itemsInStore.add(disc);
        System.out.println("Add " + disc.getTitle() + " DVD to store");
    }

    public void removeDVD(DigitalVideoDisc disc){
        itemsInStore.remove(disc);
        System.out.println("Successfully remove " + disc.getTitle() + " DVD from store");
    }

}
