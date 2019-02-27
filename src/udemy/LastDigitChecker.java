package udemy;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(0, 10, 22));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1)) {
            return false;
        }
        if (!isValid(number2)) {
            return false;
        }
        if (!isValid(number3)) {
            return false;
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        return (lastDigit1 == lastDigit2) || (lastDigit2 == lastDigit3) || (lastDigit1 == lastDigit3);
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
