package udemy.section8.arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 6, 3, 9};
        int[] resultingArray = new int[array.length];

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("-------------");

        int cell;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    cell = array[i];
                    array[i] = array[j];
                    array[j] = cell;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("-------------");
    }
}
