package com.mybank.domain;

import java.util.ArrayList;

public class Bank {

    private static final Bank myBank;
    private final ArrayList<Customer> customers = new ArrayList<>();    

    private Bank() {}

    static {
        myBank = new Bank();
    }

    public static Bank getBank() {
        return myBank;
    }

    public static void addCustomer(String f, String l) {
        myBank.customers.add(new Customer(f, l));        
    }

    public static int getNumberOfCustomers() {
        return myBank.customers.size();
    }

    public static Customer getCustomer(int index) {
        return myBank.customers.get(index);
    }
    
    public static void showCustomerDetails(int customerIndex) {
        if (customerIndex < 0 || customerIndex >= myBank.customers.size()) {
            System.out.println("Invalid customer index.");
            return;
        }
        Customer customer = Bank.getCustomer(customerIndex);
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        for (int i = 0; i < customer.getNumberOfAccounts(); i++) {
            Account account = customer.getAccount(i);
            System.out.println("Account " + (i + 1) + ": " + account.getClass().getSimpleName() + ", Balance: " + account.getBalance());
        }
    }

}
