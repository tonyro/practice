package udemy.section6_oop_p1;

public class Main {
    public static void main(String[] args) {
        // Simple Calculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubstractionResult());
        System.out.println("multiplication = " + simpleCalculator.getMultiplicationResult());
        System.out.println("division = " + simpleCalculator.getDivisionResult());
    }
}
