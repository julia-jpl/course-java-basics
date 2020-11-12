package com.rakovets.course.javabasics.practice.concurrency.masterworker;

import com.rakovets.course.javabasics.practice.concurrency.masterworker.MasterWorkerRunnableTask6;

public class MasterWorkerTask6Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask6 masterWorkerRunnableTask6 = new MasterWorkerRunnableTask6();
        Thread thread6 = new Thread(masterWorkerRunnableTask6);
        thread6.start();
    }
}
