package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.Random;

public class Factory implements Runnable {

    private final CommonList res;

    public Factory(CommonList res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
                res.produce();
        }
    }
}
