package udemy.section8.arrays.sort_array;

public class Main {
    public static void main(String[] args) {
        int[] array;
        SortArray sortArray = new SortArray();

        array = sortArray.getIntegers(9);
        System.out.println("Initial array");
        sortArray.printArray(array);

        array = sortArray.sortArray(array);

        System.out.println("Sorted array");
        sortArray.printArray(array);
    }
}
