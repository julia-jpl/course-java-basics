package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker implements Runnable {
    boolean isRun = true;
    private CommonResource commonResource;
    private ReentrantLock lock;

    public ThreadWorker(CommonResource commonResource, ReentrantLock lock) {
        this.commonResource = commonResource;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (isRun) {
            lock.lock();
            long timeSeconds = 0;
            if (commonResource.deque.peek() != null) {
                timeSeconds = commonResource.deque.pollFirst();
                try {
                    Thread.sleep(timeSeconds * 1000);
                    System.out.println("I slept " + timeSeconds + " seconds" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                lock.unlock();
                System.out.println("...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
