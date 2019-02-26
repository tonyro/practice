package udemy;

public class NumberPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1));
    }

    public static boolean isPalindrome1(int number) {
        int absNumber = Math.abs(number);
        String numberString = String.valueOf(absNumber);
        int l = numberString.length();
        char[] reverseNumberChars = new char[l];

        for (int i = 0; i < l; i++) {
            reverseNumberChars[(l - 1) - i] = numberString.charAt(i);
        }

        int reverseNumber = Integer.valueOf(new String(reverseNumberChars));

        return absNumber == reverseNumber;
    }

    public static boolean isPalindrome(int number) {
        int absNumber = Math.abs(number);
        int processingNumber = absNumber;
        int reverseNumber = 0;
        int lastDigit = 0;

        do {
            lastDigit = processingNumber % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            processingNumber /= 10;
        } while (processingNumber > 0);

        return absNumber == reverseNumber;
    }
}
