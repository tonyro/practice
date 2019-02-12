package udemy;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_INPUT_STRING = "Invalid input";

    public static void main(String[] args) {
        System.out.println(getDurationString(62, 59));
        System.out.println(getDurationString(59, 59));
        System.out.println(getDurationString(0, 0));
        System.out.println(getDurationString(124, 35));
        System.out.println(getDurationString(-2, 35));
        System.out.println(getDurationString(34, -1));

        System.out.println("----------------------------");

        System.out.println(getDurationString(234));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(100400));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(-1));
    }

    public static String getDurationString(Integer minutes, Integer seconds) {
        if (minutes < 0) {
            return INVALID_INPUT_STRING;
        }

        if (seconds < 0 || seconds > 59) {
            return INVALID_INPUT_STRING;
        }

        Integer hours = minutes / 60;
        Integer restMinutes = minutes % 60;

        return String.format("%02dh %02dm %02ds", hours, restMinutes, seconds);
    }

    public static String getDurationString(Integer seconds) {
        if (seconds < 0) {
            return INVALID_INPUT_STRING;
        }

        Integer minutes = seconds / 60;
        Integer restSeconds = seconds % 60;

        return getDurationString(minutes, restSeconds);
    }
}
