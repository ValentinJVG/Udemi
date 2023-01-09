package autoboxingAndUnboxing;

import java.util.ArrayList;

public class Branches {
    private ArrayList<Customer> customersOfThatBranch;
    private String branchName;

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customersOfThatBranch.add(new Customer(customerName, initialAmount));
            System.out.println("Customer added.");
            return true;
        }
        System.out.println("Customer is already on a branch");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public ArrayList<Customer> getCustomersOfThatBranch() {
        return customersOfThatBranch;
    }

    public String getBranchName() {
        return branchName;
    }

    public Branches(String branchName) {
        this.customersOfThatBranch = new ArrayList<>();
        this.branchName = branchName;
    }

    private Customer findCustomer(String customerName) {
        for (Customer checkedCustomer : this.customersOfThatBranch) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
