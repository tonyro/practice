package udemy;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number is: " + i);
                sum += i;
                count++;
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Count is: " + count);
    }
}
