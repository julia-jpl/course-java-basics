package com.rakovets.course.javabasics.practice.concurrency.masterworker;

import com.rakovets.course.javabasics.practice.concurrency.masterworker.MasterWorkerRunnableTask4;

public class MasterWorkerTask4Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask4 masterWorkerRunnableTask4 = new MasterWorkerRunnableTask4();
        Thread thread4 = new Thread(masterWorkerRunnableTask4);
        thread4.start();
    }
}
