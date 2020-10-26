package com.rakovets.course.javabasics.practice.generics;

import java.util.Scanner;

public class Array<T extends Number> {
    private int size;
    private T number;

    public void setSize(int size, T number) {
        this.size = size;
        this.number = number;
    }

    public int getSize() {
        return size;

    }
}
