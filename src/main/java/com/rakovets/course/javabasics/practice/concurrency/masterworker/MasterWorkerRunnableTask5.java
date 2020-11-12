package com.rakovets.course.javabasics.practice.concurrency.masterworker;

import java.util.Scanner;

public class MasterWorkerRunnableTask5 implements Runnable {
    private boolean isRun = true;

    @Override
    public void run() {
        while (isRun) {
            int number1 = 0;
            int number2 = 0;
            int number3 = 0;
            int choice = 0;
            System.out.println("Enter three numbers.");
            System.out.println("first");
            Scanner scanner = new Scanner(System.in);
            number1 = scanner.nextInt();
            System.out.println("second");
            number2 = scanner.nextInt();
            System.out.println("third");
            number3 = scanner.nextInt();
            System.out.println("If you want to get sum - enter 1, to get average - enter 2, to get product of numbers - enter 3.");
            int sum = 0;
            double average = 0;
            int multi = 0;
            int count = 0;
            while (count < 3) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        sum = number1 + number2 + number3;
                        System.out.println("The sum is " + sum);
                        count++;
                        break;
                    case 2:
                        average = (double) (number1 + number2 + number3) / 3;
                        System.out.println("The average is " + average);
                        count++;
                        break;
                    case 3:
                        multi = number1 * number2 * number3;
                        System.out.println("The product is " + multi);
                        count++;
                        break;
                    default:
                        System.out.println("Enter only 1, 2 or 3.");
                }
            }
            if (count == 3) {
                isRun = false;
            }
        }
    }
}
