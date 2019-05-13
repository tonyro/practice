package udemy.section8.arrays.reverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Initial array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));

        int[] anotherArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Initial array: " + Arrays.toString(anotherArray));
        reverse(anotherArray);
        System.out.println("Reversed array: " + Arrays.toString(anotherArray));
    }

    private static void reverse(int[] array) {
        int swapsCount = 0;
        int l = array.length;
        int k;
        int maxIndex = l - 1;
        for (int i = 0; i < l/2; i++) {
            k = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = k;
            swapsCount++;
        }

        System.out.println("Swaps count: " + swapsCount);
    }
}
