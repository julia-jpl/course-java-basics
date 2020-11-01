package com.rakovets.course.javabasics.practice.exceptionhandling.task3;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.AccountExpiredException;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account(300, true);
        try {
            account.takeCash(200);
        } catch (AccountExpiredException e) {
            e.printStackTrace();
            System.out.println("Transaction is unavailable. Account is expired.");
        }
    }
}
