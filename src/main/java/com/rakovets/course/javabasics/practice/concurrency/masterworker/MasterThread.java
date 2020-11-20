package com.rakovets.course.javabasics.practice.concurrency.masterworker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterThread implements Runnable {
    private boolean isRun = true;
    private CommonResource commonResource;
    public MasterThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (isRun) {
                System.out.println("Enter a number");
                int number = scanner.nextInt();
                if (number == -1) {
                    isRun = false;
                    System.out.println("The end.");
                } else {
                   commonResource.offer()
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data.");
            }
        }
}
