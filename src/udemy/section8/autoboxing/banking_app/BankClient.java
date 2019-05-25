package udemy.section8.autoboxing.banking_app;

import java.util.Scanner;

public class BankClient {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean toContinue = true;
        String branchName;
        String customerName;
        Double transaction;

        System.out.println("Enter the name of your new bank:");
        String bankName = scanner.nextLine();

        Bank bank = new Bank(bankName);
        System.out.println("Bank " + bankName + " is successfully established!");

        printInstructions();

        while (toContinue) {
            System.out.println("Select your option:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    toContinue = false;
                    break;
                case 1:
                    System.out.println("Please enter the name of new branch");
                    branchName = scanner.nextLine();
                    bank.addNewBranch(branchName);
                    break;
                case 2:
                    bank.printBranches();
                    break;
                case 3:
                    System.out.println("Enter branch name you want to add new customer to");
                    branchName = scanner.nextLine();
                    System.out.println("Enter new customer's name");
                    customerName = scanner.nextLine();
                    System.out.println("Enter the amount of initial transaction");
                    transaction = scanner.nextDouble();
                    scanner.nextLine();

                    bank.addNewCustomerToBranch(branchName, customerName, transaction);

                    break;
                case 4:
                    System.out.println("Enter branch name");
                    branchName = scanner.nextLine();
                    System.out.println("Enter customer's name");
                    customerName = scanner.nextLine();
                    System.out.println("Enter the amount of the transaction");
                    transaction = scanner.nextDouble();
                    scanner.nextLine();

                    bank.addTransactionToCustomerInBranch(branchName, customerName, transaction);

                    break;
                case 5:
                    System.out.println("Enter branch name");
                    branchName = scanner.nextLine();
                    bank.printCustomersInBranch(branchName);
                    break;
                case 6:
                    System.out.println("Enter branch name");
                    branchName = scanner.nextLine();
                    bank.printCustomersWithTransactionsInBranch(branchName);
                    break;
                case 9:
                    printInstructions();
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPlease select from the following options.");
        System.out.println("\tOption 1: Add new branch.");
        System.out.println("\tOption 2: Print list of branches.");
        System.out.println("\tOption 3: Add new customer.");
        System.out.println("\tOption 4: Add transaction for customer.");
        System.out.println("\tOption 5: Print list of customers in the branch.");
        System.out.println("\tOption 6: Print list of customers with transactions in the branch.");
        System.out.println("\tOption 9: Print instructions.");
        System.out.println("\tOption 0: Quit.\n");
    }
}
