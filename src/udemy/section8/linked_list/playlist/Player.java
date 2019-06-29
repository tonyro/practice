package udemy.section8.linked_list.playlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private static Playlist playlist;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MusicLibrary ml = new MusicLibrary();
        ArrayList<Song> songs = new ArrayList<>();
        boolean toContinue = true;

        // Miles Davis - King of blue
        Album kingOfBlue = new Album("King of blue");
        kingOfBlue.addSong(new Song("So What", "9:04", "King of blue"));
        kingOfBlue.addSong(new Song("Freddy Freeloader", "9:34", "King of blue"));
        kingOfBlue.addSong(new Song("Blue in green", "5:27", "King of blue"));
        kingOfBlue.addSong(new Song("All blues", "11:33", "King of blue"));
        kingOfBlue.addSong(new Song("Flamenco Sketches", "9:26", "King of blue"));

        // Bill Evans - Alone
        Album alone = new Album("Alone");
        alone.addSong(new Song("Here's that rainy day", "5:21", "Alone"));
        alone.addSong(new Song("A time for love", "5:06", "Alone"));
        alone.addSong(new Song("Midnight mood", "5:20", "Alone"));
        alone.addSong(new Song("On a clear day (You can see forever)", "4:48", "Alone"));
        alone.addSong(new Song("Never let me go", "14:32", "Alone"));
        alone.addSong(new Song("Medley: All the things you are / Midnight mood", "4:11", "Alone"));
        alone.addSong(new Song("A time for love", "6:56", "Alone"));


        ml.addAlbum(kingOfBlue);
        ml.addAlbum(alone);

        playlist = new Playlist(ml);

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (toContinue) {
            printMenu();
            String songTitle;
            String albumTitle;
            switch (choice) {
                case 0:
                    toContinue = false;
                    break;
                case 1:
                    System.out.println("Please enter song title:");
                    songTitle = scanner.nextLine();
                    System.out.println("Please enter album title:");
                    albumTitle = scanner.nextLine();
                    playlist.addSong(songTitle, albumTitle);
                    break;
                case 2:
                    System.out.println("Please enter album title:");
                    albumTitle = scanner.nextLine();
                    playlist.addAlbum(albumTitle);
                    break;
                case 3:
                    playlist.play();
                    break;
                case 4:
                    playlist.playNextSong();
                    break;
                case 5:
                    playlist.playPreviousSong();
                    break;
                case 6:
                    playlist.stop();
                    break;
                case 7:
                    printMenu();
                    break;
            }
        }


        System.out.println("Bye-bye!");
    }

    private static void printMenu() {
        System.out.println("Note: you can add songs to the playlist only from your library!");
        System.out.println("Choose from the following options:\n" +
                "1: Add song to the playlist\n" +
                "2: Add album to the playlist\n" +
                "3: Start playing the playlist\n" +
                "4: Play next song on the playlist\n" +
                "5: Play previous song on the playlist\n" +
                "6: Stop playing\n" +
                "7: Print this menu\n" +
                "0: Exit");
    }
}
