package com.rakovets.course.javabasics.practice.concurrency.masterworker;

import com.rakovets.course.javabasics.example.concurrency.model.Stoppable;

import java.util.Scanner;

public class MasterWorkerRunnableTask1 implements Runnable {
    private boolean isRun = true;

    @Override
    public void run() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        while (isRun) {
            int number = scanner.nextInt();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Enter next number");
        }
    }
}
