package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Wednesday implements Runnable {
    private final CommonList res;
    private int handPare;
    private int feetPare;
    private String torso = "torso";
    private String head = "head";
    private String hand = "hand";
    private String feet = "feet";
    private int numberOfRobotsWednesday;

    public Wednesday(CommonList res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 5; j ++) {
                res.getWednesday();
            }
        }
        System.out.println("Wednesday's details: hands-" + res.mapWednesday.get(hand) + ", feet-" + res.mapWednesday.get(feet) +
                ", heads-" + res.mapWednesday.get(head) + ", torso-" + res.mapWednesday.get(torso));
        handPare = res.mapWednesday.get(hand) / 2;
        feetPare = res.mapWednesday.get(feet) / 2;
        int[] array = new int[] {handPare, feetPare, res.mapWednesday.get(torso), res.mapWednesday.get(head)};
        numberOfRobotsWednesday = array[0];
        for (int item : array) {
            if (numberOfRobotsWednesday > item){
                numberOfRobotsWednesday = item;
            }
        }
        System.out.println("Wednesday collected " + numberOfRobotsWednesday + "robots.");

        }
}

