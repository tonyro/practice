package udemy.section7.bills_burgers;

public class Main {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getPrice());
        System.out.println("---------------------------");
        healthyBurger.addAddition(new Tomato());
        healthyBurger.addAddition(new Lettuce());
        System.out.println(healthyBurger.getPrice());
        System.out.println("---------------------------");
        healthyBurger.addAddition(new Cheese());
        healthyBurger.addAddition(new Chips());
        healthyBurger.addAddition(new Drink());
        System.out.println(healthyBurger.getPrice());
        System.out.println("===========================");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getPrice());
    }
}
