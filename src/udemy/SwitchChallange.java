package udemy;

public class SwitchChallange {
    public static void main(String[] args) {
        printChar('A');
        printChar('B');
        printChar('C');
        printChar('D');
        printChar('E');
        printChar('F');
    }

    private static void printChar(char c) {
        switch (c) {
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C':
                System.out.println('C');
                break;
            case 'D':
                System.out.println('D');
                break;
            case 'E':
                System.out.println('E');
                break;
            default:
                System.out.println("Not found");
        }
    }
}
