package udemy;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(1234567));
        System.out.println(sumDigits(1000));

    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        int workingNumber = number;
        do {
            sum += workingNumber % 10;
            workingNumber /= 10;
        } while (workingNumber > 0);

        return sum;
    }
}
