package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.Random;

public class Factory implements Runnable {

    private final CommonList res;
    private String torso = "torso";
    private String head = "head";
    private String hand = "hand";
    private String feet = "feet";
    public Factory (CommonList res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            for (int i = 1; i <= 10; i++) {
                int number = (int) (Math.random() * 4 + 1);
                switch (number) {
                    case 1:
                        res.list.add(torso);
                        break;
                    case 2:
                        res.list.add(head);
                        break;
                    case 3:
                        res.list.add(hand);
                    case 4:
                        res.list.add(feet);
                        break;
                }
            }
        }
    }
}
