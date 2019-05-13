package udemy.section8.arrays.min_element;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array");

        int numberOfElements = scanner.nextInt();
        scanner.nextLine();

        int[] array = getIntArray(numberOfElements);

        System.out.println("Entered array is: " + Arrays.toString(array));
        System.out.println("Minimum element is: " + getMinElementInIntArray(array));

    }

    private static int[] getIntArray(int numberOfElements) {
        System.out.println("Enter " + numberOfElements + " integer elements");
        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    private static int getMinElementInIntArray(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
