package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.Random;

public class ConsumerThread implements Runnable {
    private Store store;
    private boolean isRun = true;
    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (isRun) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(1100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.consume();
        }
    }
}
