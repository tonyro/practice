package udemy;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-512);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long minutesBeforeDays = minutes % 525600;

            long days = minutesBeforeDays / 1440;

            System.out.println(String.format("%d min = %d y and %d d", minutes, years, days));
        }
    }
}
