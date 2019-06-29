package udemy.section8.linked_list.playlist;

import java.util.HashMap;

public class MusicLibrary {
    private HashMap<String, Song> albumSongIndex = new HashMap<>();
    private HashMap<String, Album> albumIndex = new HashMap<>();

    public void addSong(String songTitle, String duration, String albumTitle) {
        if (albumSongIndex.containsKey(albumTitle + "," + songTitle)) {
            System.out.println("Song '" + songTitle + "' from album '" + albumTitle + "' already exists in the library.");
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
            System.out.println("Album '" + newAlbumTitle + "' already exists in the library!");
            return;
        }

        if (newAlbum.isEmpty()) {
            System.out.println("Album '" + newAlbumTitle + "' does not contain any songs. Such album cannot be added to the library!");
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
