package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    // Add media to the store
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Media added to store: " + media.getTitle());
        } else {
            System.out.println("Media is already in the store.");
        }
    }

    // Remove media from the store
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    // Display store contents
    public void displayStore() {
        System.out.println("Current store contents:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

    // Find media by title
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("No media found with title: " + title);
        return null;
    }
}
