package udemy;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
        System.out.println();
        printSquareStar(5);
        System.out.println();
        printSquareStar(-5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Input");
        } else {

            int[][] m = new int[number][number];

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || i == number - 1) {
                        m[i][j] = 1;
                    } else if (j == 0 || j == number - 1) {
                        m[i][j] = 1;
                    } else if (j == i) {
                        m[i][j] = 1;
                    } else if (i == number - 1 - j) {
                        m[i][j] = 1;
                    } else {
                        m[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (m[i][j] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                    if (j == number - 1) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
