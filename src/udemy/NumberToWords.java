package udemy;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("----------------------------");

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(reverse(-100));

        System.out.println("----------------------------");

        numberToWords(123);
        System.out.println("-----");
        numberToWords(1010);
        System.out.println("-----");
        numberToWords(1000);
        System.out.println("-----");
        numberToWords(-12);
        System.out.println("-----");
        numberToWords(1234567890);
        System.out.println("-----");

        System.out.println("----------------------------");

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int processingNumber = reverse(number);
        int c = getDigitCount(number);
        int lastDigit;
        String digitString;

        for (int i = 0; i < c; i++) {
            lastDigit = processingNumber % 10;
            switch (lastDigit) {
                case 0:
                    digitString = "Zero";
                    break;
                case 1:
                    digitString = "One";
                    break;
                case 2:
                    digitString = "Two";
                    break;
                case 3:
                    digitString = "Three";
                    break;
                case 4:
                    digitString = "Four";
                    break;
                case 5:
                    digitString = "Five";
                    break;
                case 6:
                    digitString = "Six";
                    break;
                case 7:
                    digitString = "Seven";
                    break;
                case 8:
                    digitString = "Eight";
                    break;
                case 9:
                    digitString = "Nine";
                    break;
                default:
                    digitString = "Invalid Value";
            }
            System.out.println(digitString);
            processingNumber /= 10;
        }

    }


    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digitCount = 0;

        do {
            digitCount++;
            number /= 10;
        } while (number > 0);

        return digitCount;
    }

    public static int reverse(int number) {
        int processingNumber = Math.abs(number);
        int reverseNumber = 0;
        int lastDigit;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
        }

        do {
            lastDigit = processingNumber % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            processingNumber /= 10;
        } while (processingNumber > 0);

        if (isNegative) {
            reverseNumber *= -1;
        }

        return reverseNumber;
    }
}
