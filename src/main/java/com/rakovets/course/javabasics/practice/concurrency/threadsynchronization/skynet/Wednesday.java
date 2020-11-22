package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Wednesday implements Runnable {
    private final CommonList res;
    private RobotWednesday store;
    public Wednesday (CommonList res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (res.list.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 1; i <= 5; i++) {
                String detail = res.list.removeFirst();
                if (store.mapWednesday.containsKey(detail)) {
                    store.mapWednesday.put(detail, store.mapWednesday.get(detail) + 1);
                } else {
                    store.mapWednesday.put(detail, 1);
                }
            }
        }
    }
}
