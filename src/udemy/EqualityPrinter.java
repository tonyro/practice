package udemy;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        System.out.println("-------------------");
        printEqual(1, 2, 1);
        System.out.println("-------------------");
        printEqual(1, 2, 3);
        System.out.println("-------------------");
        printEqual(-1, -1, -1);
        System.out.println("-------------------");
        printEqual(2, 3, 3);
        System.out.println("-------------------");
        printEqual(2, 3, 3);
        System.out.println("-------------------");
    }

    public static void printEqual(int k, int l, int m) {
        if (k < 0 || l < 0 || m < 0) {
            System.out.println("Invalid Value");
        } else {
            if (k == l) {
                if (l == m) {
                    System.out.println("All numbers are equal");
                } else {
                    System.out.println("Neither all are equal or different");
                }
            } else if (l == m) {
                System.out.println("Neither all are equal or different");
            } else if (k == m) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }

    }
}
