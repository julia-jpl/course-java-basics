package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorkerRunnableTask4 implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        long timeSeconds = 0;
        System.out.println("Enter a number of seconds.");
        try {
            timeSeconds = scanner.nextInt();
            try {
                Thread.sleep(timeSeconds * 1000);
                System.out.println("I slept " + timeSeconds + " seconds");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (InputMismatchException | IllegalArgumentException  e) {
            System.out.println("Incorrect data");
        }
    }
}
