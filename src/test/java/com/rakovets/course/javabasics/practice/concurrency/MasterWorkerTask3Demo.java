package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;

public class MasterWorkerTask3Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask3 masterWorkerRunnableTask3 = new MasterWorkerRunnableTask3();
        Thread thread3 = new Thread(masterWorkerRunnableTask3);
        thread3.start();
    }
}
