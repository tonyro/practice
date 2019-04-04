package udemy.section7_poly.car;


import java.util.ArrayList;
import java.util.List;

class Car {
    private String name;
    private String engine;
    private int numberOfCylinders;

    public Car(String name, String engine, int numberOfCylinders) {
        this.name = name;
        this.engine = engine;
        this.numberOfCylinders = numberOfCylinders;
    }

    public void startEngine() {
        System.out.println("Car.startEngine()");
    }

    public void accelerate() {
        System.out.println("Car.accelerate()");
    }

    public void brake() {
        System.out.println("Car.brake()");
    }

    public String toString() {
        return "Car: " + name + ", engine: " + engine + numberOfCylinders;
    }
}

class Mazda6 extends Car {

    public Mazda6() {
        super("Mazda Mazda6", "Inline", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Mazda6.startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Mazda6.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Mazda6.brake()");
    }
}

class GrandCherokeeSRT extends Car {

    public GrandCherokeeSRT() {
        super("Jeep Grand Cherokee SRT", "V", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("GrandCherokeeSRT.startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("GrandCherokeeSRT.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("GrandCherokeeSRT.brake()");
    }
}

class Swift extends Car {

    public Swift() {
        super("Suzuki Swift", "Inline", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Swift.startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Swift.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Swift.brake()");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Mazda6());
        cars.add(new GrandCherokeeSRT());
        cars.add(new Swift());

        for (Car car : cars) {
            moveCar(car);
        }
    }

    public static void moveCar(Car car) {
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
