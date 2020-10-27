package com.rakovets.course.javabasics.practice.generics;

import java.util.Scanner;

public class Array<T extends Numbers> {
    public static void main(String[] args) {

    }

    private int size;
    public Array ()


    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;

    }

    public Numbers[] fillArrayFromStandartInput(Numbers number, int size) {
        Numbers[] array = new Numbers[size];
        for (int i = 1; i < size; i++) {
            array[i] = new Numbers(number.setNumberFromStandartInput());
        }
    }
    public  Numbers[] fillArrayByRandom(Numbers number, int bound, int size) {
        Numbers[] array1 = new Numbers[size];
        for (int i = 1; i < size; i++) {
            array1[i] = (Numbers) Math.random
        }





    }

}
