package udemy.section7_oop_p2.room;

public class LivingRoom {
    private Window window;
    private Door door;
    private FloorLamp floorLamp;

    public LivingRoom(Window window, Door door, FloorLamp floorLamp) {
        this.window = window;
        this.door = door;
        this.floorLamp = floorLamp;
    }

    public void closeWindow() {
        System.out.println("Living room -> close window.");
        window.close();
    }

    public Door getDoor() {
        return door;
    }

    public FloorLamp getFloorLamp() {
        return floorLamp;
    }
}
