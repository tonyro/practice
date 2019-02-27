package udemy;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(11, 345));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99)) {
            return false;
        }
        if ((number2 < 10) || (number2 > 99)) {
            return false;
        }

        int digit1;
        int digit2;
        for (; number1 > 0; number1 /= 10) {
            digit1 = number1 % 10;
            for (int i = number2; i > 0; i /= 10) {
                digit2 = i % 10;
                if (digit1 == digit2) {
                    return true;
                }
            }
        }

        return false;
    }
}
