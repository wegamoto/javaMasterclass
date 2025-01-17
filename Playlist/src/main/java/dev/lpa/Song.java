package dev.lpa;

public class Song {

    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + (duration > 0 ? " (" + duration + " mins)" : "");
    }
}
