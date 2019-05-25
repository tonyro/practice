package udemy.section8.autoboxing.banking_app;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addNewCustomer(String customerName, Double initialTransaction) {
        if (!isCustomerExist(customerName)) {
            customers.add(new Customer(customerName, initialTransaction));
            System.out.println("Successfully added new customer " + customerName + ", with initial transaction: " + initialTransaction);
        } else {
            System.out.println("Customer with name " + customerName + " already exists!");
        }
    }

    public void processTransaction(String clientName, Double transaction) {
        Customer customer = findCustomerByName(clientName);
        if (customer != null) {
            customer.addTransaction(transaction);
            System.out.println("Transaction of amount [ " + transaction + " ] was successfully added to " + clientName);
        } else {
            System.out.println("Customer " + clientName + " was not found.");
        }
    }

    public void printCustomers() {
        if (!customers.isEmpty()) {
            for (Customer customer : customers) {
                System.out.println(customer.getName());
            }
        } else {
            System.out.println("Customers list is empty!");
        }
    }

    public void printCustomersWithTransactions() {
        if (!customers.isEmpty()) {
            for (Customer customer : customers) {
                System.out.println(customer.getName());
                for (Double transaction : customer.getTransactions()) {
                    System.out.println("\t" + transaction);
                }
            }
        } else {
            System.out.println("Customers list is empty!");
        }
    }

    public Customer findCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.getName().toLowerCase().equals(name.toLowerCase())) {
                return customer;
            }
        }
        return null;
    }

    public boolean isCustomerExist(String customerName) {
        return findCustomerByName(customerName) != null;
    }
}
