package udemy.section7_oop_p2.room;

public class Door {
    private boolean isClosed;

    public Door(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public void open() {
        if (isClosed) {
            System.out.println("Opening a door.");
            isClosed = false;
        } else {
            System.out.println("Door is already opened.");
        }
    }

    public void close() {
        if (!isClosed) {
            System.out.println("Closing a door.");
            isClosed = true;
        } else {
            System.out.println("Door is already closed.");
        }
    }
}
