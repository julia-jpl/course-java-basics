package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

public class Goods {
    private String name;
    private int price;
    public Goods (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
