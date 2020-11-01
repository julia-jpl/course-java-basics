package com.rakovets.course.javabasics.practice.exceptionhandling.task3;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.AccountExpiredException;

public class Account {
    private int amount;
    private boolean isExpired;

    public Account (int amount) {
        this.amount = amount;
    }
    public Account (int amount, boolean isExpired) {
        this.amount = amount;
        this.isExpired = isExpired;
    }
    public void takeCash(int sum) throws AccountExpiredException {
        if (isExpired) {
            throw new AccountExpiredException();
        }
        this.amount -= sum;
        System.out.println("Take your money");
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
