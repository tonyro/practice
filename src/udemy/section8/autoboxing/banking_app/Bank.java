package udemy.section8.autoboxing.banking_app;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addNewBranch(String branchName) {
        if (!isBranchExists(branchName)) {
            branches.add(new Branch(branchName));
            System.out.println("Successfully added new branch " + branchName + " to the bank " + name);
        } else {
            System.out.println("Branch " + branchName + " already exists in the bank " + name);
        }
    }

    public void addNewCustomerToBranch(String branchName, String customerName, Double initialTransaction) {
        Branch branch = findBranchByName(branchName);
        if (branch != null) {
            if (!branch.isCustomerExist(customerName)) {
                branch.addNewCustomer(customerName, initialTransaction);
                System.out.println("Successfully added new customer " + customerName + " to the branch " + branchName);
            } else {
                System.out.println("Customer " + customerName + " already exists in the branch " + branchName);
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist!");
        }
    }

    public void addTransactionToCustomerInBranch(String branchName, String customerName, Double transaction) {
        Branch branch = findBranchByName(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomerByName(customerName);
            if (customer != null) {
                customer.addTransaction(transaction);
                System.out.println("Successfully added new transaction to the customer " + customerName + " in the branch " + branchName);
            } else {
                System.out.println("Customer " + customerName + " does not exists in the branch " + branchName);
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist!");
        }
    }

    public void printCustomersInBranch(String branchName) {
        Branch branch = findBranchByName(branchName);
        if (branch != null) {
            branch.printCustomers();
        }
    }

    public void printCustomersWithTransactionsInBranch(String branchName) {
        Branch branch = findBranchByName(branchName);
        if (branch != null) {
            branch.printCustomersWithTransactions();
        }
    }

    public void printBranches() {
        if (!branches.isEmpty()) {
            for (Branch branch : branches) {
                System.out.println(branch.getName());
            }
        }
    }

    private Branch findBranchByName(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().toLowerCase().equals(branchName.toLowerCase())) {
                return branch;
            }
        }
        return null;
    }

    private boolean isBranchExists(String branchName) {
        return findBranchByName(branchName) != null;
    }
}
