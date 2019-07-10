package udemy.section9.interfaces.saveable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();;
        Magazine magazine = new Magazine();;

        System.out.println("You can create 2 types of objects: Book and Magazine.\n" +
                "Press 1 for Book." +
                "Press 2 for Magazine." +
                "Press Enter after making your choice.");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                ArrayList<String> bookElements = new ArrayList<>();
                System.out.println("Please enter details of a Book. Use the following format: 'fieldName:fieldValue.\n" +
                        "Possible fields are: author, title, numberOfPages, yearPublished, genre.");
                while (scanner.hasNext()) {
                    bookElements.add(scanner.nextLine());
                }
                restoreObject(book, bookElements);
                break;
            case 2:
                ArrayList<String> magazineElements = new ArrayList<>();
                System.out.println("Please enter details of a Magazine. Use the following format: 'fieldName:fieldValue.\n" +
                        "Possible fields are: title, month, year, numberOfPages.");
                while (scanner.hasNext()) {
                    magazineElements.add(scanner.nextLine());
                }
                restoreObject(magazine, magazineElements);
                break;
        }

        System.out.println(book);

        System.out.println(magazine);

        for (String value : book.save()) {
            System.out.println(value);
        }
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
