package udemy.section9.interfaces.saveable;

import java.util.ArrayList;

public interface Saveable {
    ArrayList<String> save();

    void restore(ArrayList<String> values);
}
