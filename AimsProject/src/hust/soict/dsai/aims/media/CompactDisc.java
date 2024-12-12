package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Media implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);
        this.artist = artist;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Add a track
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists in the CD.");
        }
    }

    // Remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track not found in the CD.");
        }
    }

    // Get total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Play method (from Playable interface)
    @Override
    public void play() {
        if (getLength() > 0) {
            System.out.println("Playing CD: " + getTitle());
            System.out.println("Artist: " + artist);
            System.out.println("CD Length: " + getLength() + " minutes");
            for (Track track : tracks) {
                track.play();
            }
        } else {
            System.out.println("Cannot play the CD. Length is zero or invalid.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "CD [Title: " + getTitle() + ", Category: " + getCategory() +
               ", Artist: " + artist + ", Tracks: " + tracks.size() +
               ", Cost: " + getCost() + "]";
    }
}
