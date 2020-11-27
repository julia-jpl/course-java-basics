package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class MasterTask implements Callable {
    private CommonResource commonResource;

    public MasterTask(CommonResource commonResource) {
        this.commonResource = commonResource;
    }


    @Override
    public Integer call() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer number = 0;
        System.out.println("Enter a number");
        try {
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Incorrect data.");
        }  return number;
    }
}


