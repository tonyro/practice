package udemy.section8.arrays.mobile_phone;

import java.util.List;
import java.util.Scanner;

public class MobilePhoneClient {
    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean toContinue = true;
        String firstName;
        String lastName;
        String phoneNumber;

        startPhone();
        printInstructions();

        while (toContinue) {
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    toContinue = false;
                    break;
                case 1:
                    printInstructions();
                    break;
                case 2:
                    printContacts();
                    break;
                case 3:
                    System.out.print("Please enter First Name: ");
                    firstName = scanner.nextLine();
                    System.out.print("Please enter Last Name: ");
                    lastName = scanner.nextLine();
                    System.out.print("Please enter Phone Number: ");
                    phoneNumber = scanner.nextLine();
                    addNewContact(firstName, lastName, phoneNumber);
                    break;
                case 4:
                    System.out.print("Please enter First Name: ");
                    firstName = scanner.nextLine();
                    System.out.print("Please enter Last Name: ");
                    lastName = scanner.nextLine();
                    updateContact(firstName, lastName);
                    break;
                case 5:
                    System.out.print("Please enter First Name: ");
                    firstName = scanner.nextLine();
                    System.out.print("Please enter Last Name: ");
                    lastName = scanner.nextLine();
                    removeContact(firstName, lastName);
                    break;
                case 6:
                    findContact();
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printInstructions() {
        System.out.println("\nPlease select from the following options.");
        System.out.println("\tOption 1: Print these options.");
        System.out.println("\tOption 2: Print contacts on the phone.");
        System.out.println("\tOption 3: Add new contact.");
        System.out.println("\tOption 4: Update existing contact.");
        System.out.println("\tOption 5: Remove contact.");
        System.out.println("\tOption 6: Find contact in the list.");
        System.out.println("\tOption 0: Quit.\n");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void addNewContact(String firstName, String lastName, String phoneNumber) {
        if (mobilePhone.addContact(firstName, lastName, phoneNumber)) {
            System.out.println("New contact for " + firstName + " " + lastName + " was successfully added.");
        } else {
            System.out.println("Contact with first name [ " + firstName + " ] and last name [ " + lastName + " ] " +
                    "already exists");
        }
    }

    private static void updateContact(String firstName, String lastName) {
        System.out.println("Please select the following update options:");
        System.out.println("\tOption 1: update First Name");
        System.out.println("\tOption 2: update Last Name");
        System.out.println("\tOption 3: update Phone Number");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Please enter new First Name");
                String newFirstName = scanner.nextLine();
                if (mobilePhone.updateFirstName(firstName, lastName, newFirstName)) {
                    System.out.println("First Name was updated for " + firstName + " " + lastName);
                }
                break;
            case 2:
                System.out.println("Please enter new Last Name");
                String newLastName = scanner.nextLine();
                if (mobilePhone.updateLastName(firstName, lastName, newLastName)) {
                    System.out.println("Last Name was updated for " + firstName + " " + lastName);
                }
                break;
            case 3:
                System.out.println("Please enter new Phone Number");
                String newPhoneNumber = scanner.nextLine();
                if (mobilePhone.updatePhoneNumber(firstName, lastName, newPhoneNumber)) {
                    System.out.println("Phone Number was updated for " + firstName + " " + lastName);
                }
                break;
            default:
                System.out.println("Could not update contact " + firstName + " " + lastName + ". Such contact does not exist.");
        }
    }

    private static void removeContact(String firstName, String lastName) {
        if (mobilePhone.removeContact(firstName, lastName)) {
            System.out.println("Contact " + firstName + " " + lastName + " was removed.");
        } else {
            System.out.println("Contact " + firstName + " " + lastName + " was not found.");
        }
    }

    private static void findContact() {
        Contact contact = null;
        System.out.println("Please select the following find options:");
        System.out.println("\tOption 1: find by First and Last Name");
        System.out.println("\tOption 2: find by Phone Number");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Please enter First Name: ");
                String firstName = scanner.nextLine();
                System.out.print("Please enter Last Name: ");
                String lastName = scanner.nextLine();

                contact = mobilePhone.findContactByName(firstName, lastName);

                if (contact != null) {
                    System.out.println("Contact " + firstName + " " + lastName + " was found.");
                }

                break;
            case 2:
                System.out.print("Please enter Phone number: ");
                String phoneNumber = scanner.nextLine();

                contact = mobilePhone.findContactByPhoneNumber(phoneNumber);

                if (contact != null) {
                    System.out.println("Contact with phone number " + phoneNumber + " was found.");
                }

                break;
        }

        if (contact == null) {
            System.out.println("Contact was not found");
        }
    }
}
