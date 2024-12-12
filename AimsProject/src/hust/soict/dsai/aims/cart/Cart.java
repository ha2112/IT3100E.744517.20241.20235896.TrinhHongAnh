package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Add media to the cart
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Media added to cart: " + media.getTitle());
        } else {
            System.out.println("Media is already in the cart.");
        }
    }

    // Remove media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Media removed from cart: " + media.getTitle());
        } else {
            System.out.println("Media not found in the cart.");
        }
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Filter by ID
    public void filterById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                return;
            }
        }
        System.out.println("No media found with ID: " + id);
    }

    // Filter by title
    public void filterByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media.toString());
                return;
            }
        }
        System.out.println("No media found with title: " + title);
    }

    // Sort by title and cost
    public void sortByTitleCost() {
        itemsOrdered.sort(Comparator.comparing(Media::getTitle)
                .thenComparing(Comparator.comparing(Media::getCost).reversed()));
        System.out.println("Cart sorted by title and cost.");
    }

    // Sort by cost and title
    public void sortByCostTitle() {
        itemsOrdered.sort(Comparator.comparing(Media::getCost).reversed()
                .thenComparing(Media::getTitle));
        System.out.println("Cart sorted by cost and title.");
    }

    // Display cart contents
    public void displayCart() {
        System.out.println("Current cart contents:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("Total cost: " + totalCost());
    }
}
