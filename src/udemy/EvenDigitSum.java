package udemy;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(1));
        System.out.println(getEvenDigitSum(2));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int digit = 0;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;

            if ((digit % 2) == 0) {
                sum += digit;
            }

            number /= 10;
        }

        return sum;
    }
}
