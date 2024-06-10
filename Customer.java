package com.mybank.domain;

import java.util.ArrayList;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final ArrayList<Account> accounts = new ArrayList<>();    

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public void addAccount(Account account) {
        accounts.add(account);        
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

}
