package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;

public class Customer extends Thread {
    private List<Goods> goods;
    List<CashDesk> cashDesks;
    int numberOfGoods;
    public Customer (String name, List<Goods> goods, List<CashDesk> cashDesks, int numberOfGoods) {
        super(name);
        this.goods = goods;
        this.cashDesks = cashDesks;
        this.numberOfGoods = numberOfGoods;
    }

    @Override
    public void run() {
        System.out.println("Customer chose goods");
        int shortestQueue = cashDesks.get(0).getQueueCustomers().size();
        int numberCashDeskWithShortestQueue = 1;
        for (int i = 0; i < cashDesks.size(); i++) {
            if (shortestQueue > cashDesks.get(i).getQueueCustomers().size()) {
                shortestQueue = cashDesks.get(i).getQueueCustomers().size();
                numberCashDeskWithShortestQueue = i + 1;
            }
        }
        System.out.println("Customer " + getName() + "has chosen the CashDesk № " + numberCashDeskWithShortestQueue );

    }

    public List<Goods> getGoods() {
        return goods;
    }
}
