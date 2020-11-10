package com.rakovets.course.javabasics.practice.concurrency;

public class MasterWorkerTask1Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask1 masterWorkerRunnableTask1 = new MasterWorkerRunnableTask1();
        Thread thread = new Thread(masterWorkerRunnableTask1, "task1");
        thread.start();
    }

}
