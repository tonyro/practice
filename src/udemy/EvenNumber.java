package udemy;

public class EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while ((number <= finishNumber) && (count < 5)) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
        }

        System.out.println("Count of even numbers is: " + count);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
