package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterThread {
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
                        commonResource.deque.addLast(number);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data.");
            }
        }
    }

}
