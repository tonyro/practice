package udemy;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 25));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(10, 36));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if ((number1 < 10) || (number2 < 10)) {
            return -1;
        }

        int greatestDivisor = -1;
        int number;
        if (number1 < number2) {
            number = number1;
        } else {
            number = number2;
        }

        for (int i = 2; i <= number; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                greatestDivisor = i;
            }
        }

        return greatestDivisor;
    }
}
