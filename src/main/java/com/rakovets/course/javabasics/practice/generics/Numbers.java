package com.rakovets.course.javabasics.practice.generics;

import java.util.Scanner;

public class Numbers {
    int number;

    public Numbers (int number) {
        this.number = number;
    }
    public Numbers ();


    public Numbers (Scanner scanner){
        number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }
}
