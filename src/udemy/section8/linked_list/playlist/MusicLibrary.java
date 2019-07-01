package udemy.section8.linked_list.playlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class MusicLibrary {
    private static final Logger logger = LoggerFactory.getLogger(MusicLibrary.class);

    private HashMap<String, Song> albumSongIndex = new HashMap<>();
    private HashMap<String, Album> albumIndex = new HashMap<>();

    public void addSong(String songTitle, String duration, String albumTitle) {
        if (albumSongIndex.containsKey(albumTitle + "," + songTitle)) {
            logger.warn("Song '{}' from album '{}' already exists in the library.", songTitle, albumTitle);
        } else {
            Song newSong = new Song(songTitle, duration, albumTitle);
            if (albumIndex.containsKey(albumTitle)) {
                albumIndex.get(albumTitle).addSong(newSong);
            } else {
                Album newAlbum = new Album(albumTitle);
                newAlbum.addSong(newSong);
                albumIndex.put(albumTitle, newAlbum);
            }
            albumSongIndex.put(albumTitle + "," + songTitle, newSong);
        }
    }

    public void addAlbum(Album newAlbum) {
        String newAlbumTitle = newAlbum.getTitle();

        if (albumIndex.containsKey(newAlbumTitle)) {
            logger.warn("Album '{}' already exists in the library!", newAlbumTitle);
            return;
        }

        if (newAlbum.isEmpty()) {
            logger.warn("Album '{}' does not contain any songs. Such album cannot be added to the library!", newAlbumTitle);
            return;
        }

        albumIndex.put(newAlbumTitle, newAlbum);

        for (Song newSong : newAlbum.getSongs()) {
            newSong.setAlbumTitle(newAlbumTitle);
            albumSongIndex.put(newAlbumTitle + "," + newSong.getTitle(), newSong);
        }
    }

    public Song findSong(String albumTitle, String songTitle) {
        return albumSongIndex.get(albumTitle + "," + songTitle);
    }

    public Album findAlbum(String albumTitle) {
        return albumIndex.get(albumTitle);
    }
}
