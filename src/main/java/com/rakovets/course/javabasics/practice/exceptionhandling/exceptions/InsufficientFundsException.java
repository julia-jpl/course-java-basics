package com.rakovets.course.javabasics.practice.exceptionhandling.exceptions;

public class InsufficientFundsException extends RuntimeException{
    private String message;
    public InsufficientFundsException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
