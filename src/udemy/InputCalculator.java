package udemy;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        if (counter > 0) {
            avg = (int)Math.round((double)sum / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
