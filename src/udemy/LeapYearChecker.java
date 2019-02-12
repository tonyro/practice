package udemy;

public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println("The following ages have teen: 9, 99, 19 -> " + hasTeen(9, 99, 19));
        System.out.println("The following ages have teen: 23, 15, 42 -> " + hasTeen(23, 15, 42));
        System.out.println("The following ages have teen: 22, 23, 34 -> " + hasTeen(22, 23, 34));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 400 == 0){
            return true;
        } else if (((year % 4) == 0) && ((year % 100) != 0)) {
            return true;
        }

        return false;
    }

    public static boolean hasEqualSum(int addendum1, int addendum2, int sum) {
        if ((addendum1 + addendum2) == sum) {
            return true;
        }

        return false;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ((13 <= age1) && (age1 <= 19)) {
            return true;
        }

        if ((13 <= age2) && (age2 <= 19)) {
            return true;
        }

        if ((13 <= age3) && (age3 <= 19)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int age) {
        return (13 <= age) && (age <= 19);

    }
}
