package udemy.section8.linked_list.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private ArrayList<Album> albums = new ArrayList<>();
    private LinkedList<Song> songs = new LinkedList<>();
    private MusicLibrary musicLibrary;
    private ListIterator<Song> playingQueue;
    private boolean playForward;

    public Playlist(MusicLibrary musicLibrary) {
        this.musicLibrary = musicLibrary;
    }

    public void addAlbum(String albumTitle) {
        Album album = musicLibrary.findAlbum(albumTitle);
        if(album != null) {
            songs.addAll(album.getSongs());
        } else {
            System.out.println("Album '" + albumTitle + "' is not in your library! You cannot play it!");
        }
    }

    public void addSong(String songTitle, String albumTitle) {
        Song song = musicLibrary.findSong(albumTitle, songTitle);
        if(song != null) {
            songs.add(song);
        } else {
            System.out.println("Song '" + songTitle + "' from album '" + albumTitle + "' is not in your library! You cannot play it!");
        }
    }

    public void play() {
        if (playingQueue != null) {
            System.out.println("Playing is already in progress!");
            return;
        }

        playingQueue = songs.listIterator();
        if (playingQueue.hasNext()) {
            Song song = playingQueue.next();
            playForward = true;
            System.out.println("Playing song '" + song.getTitle() + "' from album '" + song.getAlbumTitle() + "'.");
        }
    }

    public void playNextSong() {
        if (playingQueue.hasNext()) {
            Song song = playingQueue.next();
            playForward = true;
            System.out.println("Playing song '" + song.getTitle() + "' from album '" + song.getAlbumTitle() + "'.");
        } else if(playForward) {
            System.out.println("It's the end of the playlist!");
        }
    }

    public void playPreviousSong() {
        if (playingQueue.hasPrevious()) {
            Song song = playingQueue.previous();
            playForward = false;
            System.out.println("Playing song '" + song.getTitle() + "' from album '" + song.getAlbumTitle() + "'.");
        } else if (!playForward) {
            System.out.println("It's the start of the playlist!");
        }
    }

    public void stop() {
        if (playingQueue == null) {
            System.out.println("Playlist is empty. Nothing is playing.");
        } else {
            playingQueue = null;
        }
    }

}
