package com.rakovets.course.javabasics.practice.concurrency.utilities;

public class WorkerTask2 implements Runnable{
    private CommonResource commonResource;
    public WorkerTask2 (CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        System.out.println("...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
