package udemy.doublesandfloats;

public class LbToKgConverter {
    public static void main(String[] args) {
        double lbsToKgsRatio = 0.45359237;

        double weightInLbs = 200d;
        double weightInKgs = weightInLbs * lbsToKgsRatio;

        System.out.println("Weight in pounds: " + weightInLbs);
        System.out.println("Weight in kilos: " + weightInKgs);
    }
}
