package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;

public class Customer extends Thread {
    private List<Goods> goods;
    CommonResource res;
    int numberOfGoods;
    public Customer (String name, List<Goods> goods, CommonResource res, int numberOfGoods) {
        super(name);
        this.goods = goods;
        this.res = res;
        this.numberOfGoods = numberOfGoods;
    }

    @Override
    public void run() {
        System.out.println("Customer chose goods");
        int numberCashDeskWithShortestQueue = res.chooseQueue();
        System.out.println("Customer " + getName() + "has chosen the CashDesk № " + numberCashDeskWithShortestQueue );

    }

    public List<Goods> getGoods() {
        return goods;
    }
}
