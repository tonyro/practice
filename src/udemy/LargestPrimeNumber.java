package udemy;

public class LargestPrimeNumber {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(2));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrimeFactor = -1;
        int divisorsCount;

        for (int i = 1; i <= number; i++) {
            divisorsCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorsCount++;
                }
            }
            if (divisorsCount == 2) {
                if (number % i == 0){
                    largestPrimeFactor = i;
                }
            }
        }

        return largestPrimeFactor;
    }
}
