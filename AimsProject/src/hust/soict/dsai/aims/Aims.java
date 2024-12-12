package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> viewStore(scanner);
                case 2 -> updateStore(scanner);
                case 3 -> cart.displayCart();
                case 0 -> System.out.println("Exiting AIMS...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    private static void viewStore(Scanner scanner) {
        store.displayStore();
        System.out.println("Options: ");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.print("Choose an option: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (option) {
            case 1 -> {
                System.out.print("Enter media title: ");
                String title = scanner.nextLine();
                Media media = store.findMediaByTitle(title);
                if (media != null) System.out.println(media);
            }
            case 2 -> {
                System.out.print("Enter media title to add to cart: ");
                String title = scanner.nextLine();
                Media media = store.findMediaByTitle(title);
                if (media != null) cart.addMedia(media);
            }
            case 3 -> {
                System.out.print("Enter media title to play: ");
                String title = scanner.nextLine();
                Media media = store.findMediaByTitle(title);
                if (media instanceof hust.soict.dsai.aims.media.Playable playable) {
                    playable.play();
                } else {
                    System.out.println("This media cannot be played.");
                }
            }
            case 4 -> cart.displayCart();
            case 0 -> System.out.println("Returning to main menu...");
            default -> System.out.println("Invalid option.");
        }
    }

    private static void updateStore(Scanner scanner) {
        System.out.println("Options: ");
        System.out.println("1. Add media to store");
        System.out.println("2. Remove media from store");
        System.out.print("Choose an option: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (option) {
            case 1 -> {
                // Example: Add media manually for simplicity
                System.out.print("Enter media title: ");
                String title = scanner.nextLine();
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter cost: ");
                float cost = scanner.nextFloat();
                Media media = new hust.soict.dsai.aims.media.Book(0, title, category, cost);
                store.addMedia(media);
            }
            case 2 -> {
                System.out.print("Enter media title to remove: ");
                String title = scanner.nextLine();
                Media media = store.findMediaByTitle(title);
                if (media != null) store.removeMedia(media);
            }
            default -> System.out.println("Invalid option.");
        }
    }
}
