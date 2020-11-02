package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.InsufficientFundsException;
import com.rakovets.course.javabasics.practice.exceptionhandling.task3.Account;

public class Transaction {
    private Account to;
    private Account from;

    public Transaction (Account to, Account from) {
        this.to = to;
        this.from = from;
    }

    public void getTransactionFromTo(int sum) throws InsufficientFundsException {
        if (sum > from.getAmount()) {
            throw new InsufficientFundsException("Not enough money");
        }
        to.setAmount(to.getAmount() + sum);
        from.setAmount(from.getAmount() - sum);
        System.out.println("Transaction is completed successfully");
    }

    public Account getFrom() {
        return from;
    }

    public Account getTo() {
        return to;
    }

}
