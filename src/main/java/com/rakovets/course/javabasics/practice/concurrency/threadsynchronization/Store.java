package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Store {
    List list = new LinkedList();

    public void produce() {
        for (int i = 1; i <= 10; i++){
        Random random = new Random(100);
        list.add(random.nextInt());
        }
    }
}
