package com.rakovets.course.javabasics.practice.generics;

import java.util.Scanner;

public class Numbers<T extends Number> {
    private T number;

    public Numbers (T number) {
        this.number = number;
    }



    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
