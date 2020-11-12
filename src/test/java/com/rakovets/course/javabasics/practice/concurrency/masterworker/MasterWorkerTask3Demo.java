package com.rakovets.course.javabasics.practice.concurrency.masterworker;

import com.rakovets.course.javabasics.practice.concurrency.masterworker.MasterWorkerRunnableTask3;

public class MasterWorkerTask3Demo {
    public static void main(String[] args) {
        MasterWorkerRunnableTask3 masterWorkerRunnableTask3 = new MasterWorkerRunnableTask3();
        Thread thread3 = new Thread(masterWorkerRunnableTask3);
        thread3.start();
    }
}
