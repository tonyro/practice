package udemy.section8.linked_list.playlist;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String name) {
        this.title = name;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
