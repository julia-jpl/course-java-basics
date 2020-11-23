package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CommonList {
    private String torso = "torso";
    private String head = "head";
    private String hand = "hand";
    private String feet = "feet";
    LinkedList<String> list = new LinkedList<>();
    Map<String, Integer> mapWorld = new HashMap<>();
    Map<String, Integer> mapWednesday = new HashMap<>();

    public CommonList(LinkedList<String> list) {
        this.list = list;
    }

    public synchronized void produce() {
        while (list.size() > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            int number = (int) (Math.random() * 4 + 1);
            switch (number) {
                case 1:
                    list.addLast(torso);
                    break;
                case 2:
                    list.addLast(head);
                    break;
                case 3:
                    list.addLast(hand);
                    break;
                case 4:
                    list.addLast(feet);
                    break;
                default:
                    break;
            }
        } notifyAll();
    }

    public synchronized void getWorld() {
        while (list.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 5; i++) {
            if (list.peekFirst() != null) {
                String detail = list.removeFirst();
                if (mapWorld.containsKey(detail)) {
                    mapWorld.put(detail, mapWorld.get(detail) + 1);
                } else {
                    mapWorld.put(detail, 1);
                }
            }
        } notifyAll();
    }

    public synchronized void getWednesday() {
        while (list.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 5; i++) {
            if (list.peekFirst() != null) {
                String detail = list.removeFirst();
                if (mapWednesday.containsKey(detail)) {
                    mapWednesday.put(detail, mapWednesday.get(detail) + 1);
                } else {
                    mapWednesday.put(detail, 1);
                }
            }
        } notifyAll();
    }
}



