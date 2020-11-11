package com.rakovets.course.javabasics.practice.concurrency;

public class MasterWorkerTask5Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask5 masterWorkerRunnableTask5 = new MasterWorkerRunnableTask5();
        Thread thread5 = new Thread(masterWorkerRunnableTask5);
        thread5.start();
    }
}
