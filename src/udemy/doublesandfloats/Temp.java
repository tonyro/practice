package udemy.doublesandfloats;

public class Temp {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(3, 6);
        calcFeetAndInchesToCentimeters(3, 26);
        calcFeetAndInchesToCentimeters(-1, 6);

        calcFeetAndInchesToCentimeters(138);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || !((0 <= inches) && (inches <= 12))) {
            System.out.println("Invalid input");
            return -1;
        }


        double totalInches = (feet * 12) + inches;
        double centimeters = totalInches * 2.54;

        System.out.println(feet + " feet and " + inches + " equals to " + centimeters + " centimeters");

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid input");
            return -1;
        }


        int totalFeet = (int) inches / 12;
        int totalInches = (int) inches % 12;
        double centimeters = calcFeetAndInchesToCentimeters((double) totalFeet, (double) totalInches);

        System.out.println(inches + " equals to " + centimeters + " centimeters");

        return centimeters;
    }
}
