package udemy;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(0));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int divisorsSum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorsSum += i;
            }
        }

        return number == divisorsSum;
    }
}
