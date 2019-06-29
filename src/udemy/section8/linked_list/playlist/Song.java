package udemy.section8.linked_list.playlist;

public class Song {
    private String title;
    private String duration;
    private String albumTitle;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song(String title, String duration, String albumTitle) {
        this.title = title;
        this.duration = duration;
        this.albumTitle = albumTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }
}
