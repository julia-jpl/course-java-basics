package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.LinkedList;

import java.util.Random;

public class Store {
    final int listSize = 10;
    LinkedList list = new LinkedList();



    public synchronized void produce() {
        while (list.size()  >= listSize) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10 && list.size() < listSize; i++){
        Random random = new Random();
        list.add(random.nextInt());
        System.out.println("ProducerThread added 1 number to the store. The store contains " + list.size() + "numbers.");
        }
        notify();
    }
    public synchronized void consume() {
        while (list.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.removeFirst();
        System.out.println("Consumer got 1 number. The store contains " + list.size() + "numbers.");
        notify();
        }
    }
