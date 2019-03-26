package udemy.section6_oop_p1;

public class Main {
    public static void main(String[] args) {
        // Simple Calculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());
        System.out.println("multiplication = " + simpleCalculator.getMultiplicationResult());
        System.out.println("division = " + simpleCalculator.getDivisionResult());

        System.out.println("-------------------");

        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());
        System.out.println("multiplication = " + simpleCalculator.getMultiplicationResult());
        System.out.println("division = " + simpleCalculator.getDivisionResult());

        System.out.println("====================");

        // Person
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        System.out.println("-------------------");
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        System.out.println("-------------------");
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());

        System.out.println("====================");
    }
}
