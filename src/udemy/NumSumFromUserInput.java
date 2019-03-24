package udemy;

import java.util.Scanner;

public class NumSumFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        do {
            System.out.println("Enter number #" + (counter + 1));
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        } while (counter < 10);

        scanner.close();

        System.out.println("The sum is: " + sum);
    }
}
