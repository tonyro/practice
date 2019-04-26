package udemy.section8.arrays.sort_array;

import java.util.Scanner;

public class SortArray {
    public int[] getIntegers(int numberOfElements) {
        System.out.println("Enter " + numberOfElements + " integer elements");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void printArray(int[] array) {
        String result = "[ ";

        for (int i = 0; i < array.length; i++) {
            result += array[i] + ", ";
        }

        result = result.trim();
        result += " ]";

        System.out.println(result);
    }

    public int[] sortArray(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        int cell;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] > result[i]) {
                    cell = result[i];
                    result[i] = result[j];
                    result[j] = cell;
                }
            }
        }

        return result;
    }
}
