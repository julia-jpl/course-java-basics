package com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker;

import com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker.CommonResource;

public class ThreadWorker implements Runnable {
    private CommonResource commonResource;

    public ThreadWorker(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
            long timeSeconds = 0;
            if (commonResource.deque.peek() != null) {
                timeSeconds = commonResource.deque.pollFirst();
                try {
                    Thread.sleep(timeSeconds * 1000);
                    System.out.println("I slept " + timeSeconds + " seconds " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (commonResource.deque.isEmpty()) {
                System.out.println("...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
