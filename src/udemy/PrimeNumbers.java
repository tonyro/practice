package udemy;

public class PrimeNumbers {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 50; i < 1300; i++) {
            if (c < 3) {
                if (isPrimeNumber(i)) {
                    c++;
                    System.out.println(i);
                }
            } else {
                break;
            }
        }

        System.out.println(c);
    }

    private static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
