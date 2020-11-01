package com.rakovets.course.javabasics.practice.exceptionhandling.task4;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.InsufficientFundsException;
import com.rakovets.course.javabasics.practice.exceptionhandling.task3.Account;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction demo = new Transaction(new Account(300), new Account(100));
        try {
            demo.getTransactionFromTo(150);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
