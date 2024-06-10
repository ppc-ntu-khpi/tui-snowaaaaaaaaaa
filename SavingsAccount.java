package com.mybank.domain;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }

}
