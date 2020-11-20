package com.rakovets.course.javabasics.practice.concurrency.masterworker;

public class ThreadWorker implements Runnable {
    boolean isRun = true;

    @Override
    public void run() {
        while (isRun) {

            System.out.println("...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
