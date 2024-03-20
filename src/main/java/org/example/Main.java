package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Create a client
        Client client = new Client("John", "Doe", "123");

        // Create an account for the client
        Account account = new Account("ACC-001", BigDecimal.ZERO, client);

        // Deposit money
        account.deposit(new BigDecimal("1000"));

        // Withdraw money
        account.withdraw(new BigDecimal("200"));

        // Print account balance
        System.out.println("Account balance: " + account.accountBalance());
    }
}
