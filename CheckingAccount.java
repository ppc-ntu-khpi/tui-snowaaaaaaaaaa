package com.mybank.domain;

public class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
        super(balance);
    }

    /**
     *
     * @param amt
     * @return
     */
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
