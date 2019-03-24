package udemy;

import java.util.Scanner;

public class MinMaxNumFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483648;

        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("min: " + min + ", max: " + max);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
