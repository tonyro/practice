package udemy.section9.interfaces.saveable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void saveObject(Saveable object) {
        ArrayList<String> objectElements = object.save();

        for (String el : objectElements) {
            System.out.println(el);
        }
    }

    public static void restoreObject(Saveable object, ArrayList<String> objectElements) {
        object.restore(objectElements);
    }

    private void printMenu() {
        System.out.println("");
    }
}
