package udemy.section9.inner_classes.playlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private static final Logger logger = LoggerFactory.getLogger(Playlist.class);

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
            logger.warn("Album '{}' is not in your library! You cannot play it!", albumTitle);
        }
    }

    public void addSong(String songTitle, String albumTitle) {
        Song song = musicLibrary.findSong(albumTitle, songTitle);
        if(song != null) {
            songs.add(song);
        } else {
            logger.warn("Song '{}' from album '{}' is not in your library! You cannot play it!",
                    songTitle,
                    albumTitle);
        }
    }

    public void play() {
        if (playingQueue != null) {
            logger.info("Playing is already in progress!");
            return;
        }

        playingQueue = songs.listIterator();
        if (playingQueue.hasNext()) {
            Song song = playingQueue.next();
            playForward = true;
            logger.info("Playing song '{}' from album '{}'.", song.getTitle(), song.getAlbumTitle());
        }
    }

    public void playNextSong() {
        if (playingQueue.hasNext()) {
            Song song = playingQueue.next();
            playForward = true;
            logger.info("Playing song '{}' from album '{}'.", song.getTitle(), song.getAlbumTitle());
        } else if(playForward) {
            logger.info("It's the end of the playlist!");
        }
    }

    public void playPreviousSong() {
        if (playingQueue.hasPrevious()) {
            Song song = playingQueue.previous();
            playForward = false;
            logger.info("Playing song '{}' from album '{}'.", song.getTitle(), song.getAlbumTitle());
        } else if (!playForward) {
            logger.info("It's the start of the playlist!");
        }
    }

    public void stop() {
        if (playingQueue == null) {
            logger.info("Playlist is empty. Nothing is playing.");
        } else {
            playingQueue = null;
        }
    }

}
