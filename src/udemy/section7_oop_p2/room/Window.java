package udemy.section7_oop_p2.room;

public class Window {
    private boolean isClosed;

    public Window(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public void open() {
        if (isClosed) {
            System.out.println("Opening a window.");
            isClosed = false;
        } else {
            System.out.println("Window is already opened.");
        }
    }

    public void close() {
        if (!isClosed) {
            System.out.println("Window -> Closing a window.");
            isClosed = true;
        } else {
            System.out.println("Window -> Window is already closed.");
        }
    }
}
