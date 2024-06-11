package com.mybank.tui;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<Integer, Customer> customers;

    public Bank() {
        customers = new HashMap<>();
        // Adding sample customers for demonstration
        Customer customer1 = new Customer(1, "John Doe");
        customer1.addAccount(new Account("Checking", 200.00));
        Customer customer2 = new Customer(2, "Jane Smith");
        customer2.addAccount(new Account("Savings", 1500.00));

        customers.put(1, customer1);
        customers.put(2, customer2);
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }
}
