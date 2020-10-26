package com.rakovets.course.javabasics.practice.generics;

import java.util.Scanner;

public class Array<T extends Number> {
    private int size;
    private T object;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    Array<T>[] objects = new Array[size];


   public Array<T>[] getArray() {
       Scanner in = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
        objects[i] = new Array<>(in.nextT);
    }
}
