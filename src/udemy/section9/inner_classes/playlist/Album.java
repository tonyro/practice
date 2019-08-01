package udemy.section9.inner_classes.playlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private static final Logger logger = LoggerFactory.getLogger(Album.class);

    private String title;
    private SongList songList;

    public Album(String name) {
        this.title = name;
        this.songList = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songList.songs;
    }

    public void addSong(Song song) {
        songList.addSong(song);
    }

    public void addSongs(List<Song> songs) {
        songList.addSongs(songs);
    }

    public Song findSong(String title) {
        return songList.findSong(title);
    }

    public boolean isEmpty() {
        return songList.isEmpty();
    }


    private class SongList {
        private ArrayList<Song> songs = new ArrayList<>();

        public void addSong(Song newSong) {
            if (findSong(newSong.getTitle()) == null) {
                songs.add(newSong);
            } else {
                logger.warn("Song '{}' is already on album!", newSong.getTitle());
            }
        }

        public void addSongs(List<Song> newSongs) {
            for (Song newSong : newSongs) {
                addSong(newSong);
            }
        }

        public boolean isEmpty() {
            return songs.isEmpty();
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
}
