package udemy.section6_oop_p1;

public class Main {
    public static void main(String[] args) {
        // Simple Calculator
        System.out.println("Simple Calculator");
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

        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Person
        System.out.println("Person");
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

        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Wall
        System.out.println("Wall");
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        System.out.println("-------------------");
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Point
        System.out.println("Point");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        System.out.println("-------------------");
        Point point = new Point();
        System.out.println("distance() = "  + point.distance());
    }
}
