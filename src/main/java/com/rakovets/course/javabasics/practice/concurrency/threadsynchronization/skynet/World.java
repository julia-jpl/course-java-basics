package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.Map;

public class World implements Runnable {
    private final CommonList res;
    private RobotWorld store;
    private int handPare;
    private int feetPare;
    private String torso = "torso";
    private String head = "head";
    private String hand = "hand";
    private String feet = "feet";
    private int numberOfRobotsWorld;

    public World(CommonList res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            res.getWorld();
        }
        System.out.println("World's details: hands-" + res.mapWorld.get(hand) + ", feet-" + res.mapWorld.get(feet) +
                ", heads-" + res.mapWorld.get(head) + ", torso-" + res.mapWorld.get(torso));
        handPare = res.mapWorld.get(hand) / 2;
        feetPare = res.mapWorld.get(feet) / 2;
        int[] array = new int[]{handPare, feetPare, res.mapWorld.get(torso), res.mapWorld.get(head)};
        numberOfRobotsWorld = array[0];
        for (int item : array) {
            if (numberOfRobotsWorld > item) {
                numberOfRobotsWorld = item;
            }
        }
        System.out.println("World collected " + numberOfRobotsWorld + "robots.");
    }
}
