package udemy.section7_oop_p2.room;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(true);
        Door door = new Door(true);
        FloorLamp floorLamp = new FloorLamp();

        LivingRoom livingRoom = new LivingRoom(window, door, floorLamp);
        livingRoom.getDoor().close();
        livingRoom.closeWindow();
        livingRoom.getFloorLamp().turnOn();
        System.out.println("--------------");
        livingRoom.getFloorLamp().turnOff();
        livingRoom.getDoor().open();
        livingRoom.getDoor().close();
    }
}
