package com.rakovets.course.javabasics.practice.concurrency.masterworker;

public class MasterWorkerTask3Demo {
    public static void main(String[] args) {
        MasterThread masterThreadRunnableTask3 = new MasterThread();
        Thread thread3 = new Thread(masterThreadRunnableTask3);
        thread3.start();
    }
}
