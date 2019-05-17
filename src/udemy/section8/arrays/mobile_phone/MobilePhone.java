package udemy.section8.arrays.mobile_phone;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public boolean addContact(String firstName, String lastName, String phoneNumber) {
        if (!isContactExists(firstName, lastName)) {
            contacts.add(new Contact(firstName, lastName, phoneNumber));
            return true;
        }
        return false;
    }

    public Contact findContactByName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                if (contact.getFirstName().equals(firstName)) {
                    return contact;
                }
            }
        }
        return null;
    }

    public Contact findContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public boolean updateFirstName(String firstName, String lastName, String newFirstName) {
        Contact contact = findContactByName(firstName, lastName);
        if (contact != null) {
            contact.setFirstName(newFirstName);
            return true;
        }
        return false;
    }

    public boolean updateLastName(String firstName, String lastName, String newLastName) {
        Contact contact = findContactByName(firstName, lastName);
        if (contact != null) {
            contact.setLastName(newLastName);
            return true;
        }
        return false;
    }

    public boolean updatePhoneNumber(String firstName, String lastName, String newPhoneNumber) {
        Contact contact = findContactByName(firstName, lastName);
        if (contact != null) {
            contact.setPhoneNumber(newPhoneNumber);
            return true;
        }
        return false;
    }

    public boolean removeContact(String firstName, String lastName) {
        Contact contact = findContactByName(firstName, lastName);
        if (contact != null) {
            contacts.remove(contact);
            return true;
        }
        return false;
    }

    public void printContacts() {
        if (!contacts.isEmpty()) {
            for (Contact contact : contacts) {
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " : " + contact.getPhoneNumber());
            }
        } else {
            System.out.println("Contact list is empty.");
        }
    }

    private boolean isContactExists(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
