package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.Map;

public class World implements Runnable {
    private final CommonList res;
    private RobotWorld store;
    public World (CommonList res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            for (int i = 1; i <= 5; i++) {
                String detail = res.list.removeFirst();
                if (store.mapWorld.containsKey(detail)) {
                    store.mapWorld.put(detail, store.mapWorld.get(detail) + 1);
                } else {
                    store.mapWorld.put(detail, 1);
                }
            }
        }
    }
}
