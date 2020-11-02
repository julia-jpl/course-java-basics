package com.rakovets.course.javabasics.practice.exceptionhandling.exceptions;

public class NegativeHeightWidthRectangleException extends Exception {
    private String message;
    private Exception myException;
    public NegativeHeightWidthRectangleException (String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
