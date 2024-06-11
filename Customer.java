package com.mybank.tui;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final int id;
    private final String name;
    private final List<Account> accounts;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}