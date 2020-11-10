package com.rakovets.course.javabasics.practice.concurrency;

public class MasterWorkerTask2Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask2 masterWorkerRunnable2 = new MasterWorkerRunnableTask2();
        Thread thread2 = new Thread(masterWorkerRunnable2, "Task2");
        thread2.start();

    }
}
