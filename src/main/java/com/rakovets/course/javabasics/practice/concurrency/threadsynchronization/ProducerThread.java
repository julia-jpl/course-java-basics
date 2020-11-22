package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

public class ProducerThread implements Runnable {
    private Store store;
    private boolean isRun = true;
    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (isRun) {
            store.produce();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
