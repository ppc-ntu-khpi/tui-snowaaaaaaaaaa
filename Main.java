package com.mybank.domain;

public class Main {
    public static void main(String[] args) {

        // Додавання клієнтів
        Bank.addCustomer("John", "Doe");
        Bank.addCustomer("Jane", "Smith");

        // Додавання рахунків клієнтам
        Customer customer1 = Bank.getCustomer(0);
        customer1.addAccount(new CheckingAccount(500.0));
        customer1.addAccount(new SavingsAccount(1500.0));

        Customer customer2 = Bank.getCustomer(1);
        customer2.addAccount(new CheckingAccount(800.0));

        // Вивід деталей клієнтів
        Bank.showCustomerDetails(0);
        Bank.showCustomerDetails(1);
    }
}
