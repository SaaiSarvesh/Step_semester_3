package week_7.assignment_problems;

import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int count;

    public Playlist(int maxCapacity) {
        this.songs = new String[maxCapacity];
        this.count = 0;
    }

    public void addSong(String songTitle) {
        if (songTitle != null && count < songs.length) {
            songs[count] = songTitle;
            count++;
        }
    }

    public String[] getSongs() {
        // Return a safe copy of only the songs added so far
        return Arrays.copyOf(this.songs, this.count);
    }

    public int getSongCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked"; // Modify external copy

        // The original playlist contents remain intact
        System.out.println("p.getSongs()[0] is still \"" + p.getSongs()[0] + "\"");
        System.out.println("p.getSongCount() -> " + p.getSongCount());
    }
}