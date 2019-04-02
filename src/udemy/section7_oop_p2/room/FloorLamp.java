package udemy.section7_oop_p2.room;

public class FloorLamp {
    private boolean isOn = false;

    public void turnOn() {
        if (isOn) {
            System.out.println("Floor Lamp is already on.");
        } else {
            isOn = true;
            System.out.println("Turning Floor Lamp on.");
        }
    }

    public void turnOff() {
        if (!isOn) {
            System.out.println("Floor Lamp is already off.");
        } else {
            isOn = false;
            System.out.println("Turning Floor Lamp off.");
        }
    }
}
