package udemy.section6_oop_p1.carpet_cost_calculator;

public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total cost = " + calculator.getTotalCost());
        System.out.println("---------------------");
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total cost = " + calculator.getTotalCost());
    }
}
