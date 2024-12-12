package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
    private int length;
    private String director;

    // Constructor
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    // Getters
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    // Play method (from Playable interface)
    @Override
    public void play() {
        if (length > 0) {
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("DVD length: " + length + " minutes");
        } else {
            System.out.println("Cannot play the DVD. Length is zero or invalid.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "DVD [Title: " + getTitle() + ", Category: " + getCategory() +
               ", Director: " + director + ", Length: " + length + " mins, Cost: " + getCost() + "]";
    }
}
