package com.rakovets.course.javabasics.practice.concurrency.utilities;

public class WorkerTask1  implements Runnable{
    private CommonResource commonResource;
    public WorkerTask1 (CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        long timeSeconds = commonResource.deque.pollFirst();
        try {
            Thread.sleep(timeSeconds * 1000);
            System.out.println("I slept " + timeSeconds + " seconds " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
