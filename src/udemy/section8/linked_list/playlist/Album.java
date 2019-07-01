package udemy.section8.linked_list.playlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Album {
    private static final Logger logger = LoggerFactory.getLogger(Album.class);

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

    public void addSongs(ArrayList<Song> newSongs) {
        for (Song newSong : newSongs) {
            addSong(newSong);
        }
    }

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    public void addSong(Song song) {
        if (findSong(song.getTitle()) == null) {
            songs.add(song);
        } else {
            logger.warn("Song '{}' is already on album!", song.getTitle());
        }
    }

    public Song findSong(String title) {
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
}
