package com.example.springboot.design.system.banking;

import java.util.Comparator;
import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
        accounts = new LinkedHashMap<>();
    }

    private Account getAccount(Long accountNumber) {
        // complete the function
        return accounts.get(accountNumber);
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        // complete the function
        long maxAccountNumber;
        if (accounts.isEmpty()) {
            maxAccountNumber = 1;
        } else {
            maxAccountNumber  = accounts.keySet().stream().max(Comparator.comparingLong(entry -> entry.longValue())).get();
        ++maxAccountNumber;
        }
        accounts.put(maxAccountNumber, new CommercialAccount(company, maxAccountNumber, pin, startingDeposit));
        return maxAccountNumber;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {

        long maxAccountNumber;
        if (accounts.isEmpty()) {
            maxAccountNumber = 1;
        } else {
            maxAccountNumber = accounts.keySet().stream().max(Comparator.comparingLong(Long::longValue)).get();
            ++maxAccountNumber;
        }
        accounts.put(maxAccountNumber, new ConsumerAccount(person, maxAccountNumber, pin, startingDeposit));
        return maxAccountNumber;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        // complete the function
        Account account = accounts.get(accountNumber);
        return account.validatePin(pin);
    }

    public double getBalance(Long accountNumber) {
        // complete the function
        return accounts.get(accountNumber).getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        // complete the function
        accounts.get(accountNumber).creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
        // complete the function
        return accounts.get(accountNumber).debitAccount(amount);
    }
}
