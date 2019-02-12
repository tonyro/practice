package udemy;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 24));
        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(true, 24));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25) {
            return false;
        }

        if (summer) {
            return temperature <= 45;
        } else {
            return temperature <= 35;
        }
    }
}
