package com.mybank.tui;

public class Account {
    private final String type;
    private final double balance;

    public Account(String type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }
}