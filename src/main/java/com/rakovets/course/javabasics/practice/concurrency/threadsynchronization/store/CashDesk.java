package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.Deque;
import java.util.List;


public class CashDesk {
    private String name;
    private Deque<Customer> queueCustomers;
    public CashDesk (String name, Deque<Customer> queueCustomers) {
        this.name = name;
        this.queueCustomers = queueCustomers;
    }

    public Deque<Customer> getQueueCustomers() {
        return queueCustomers;
    }
    public void takeQueue(Customer customer) {
        for (Customer item : queueCustomers) {
            if ()
        }
    }

    public String getCustomerGoods() {
        String goods = "";
        if (queueCustomers.peek() != null) {
        List<Goods> list = queueCustomers.getFirst().getGoods();
        StringBuilder stringBuilder = new StringBuilder(list.get(0).toString());
        for (int i = 1; i < list.size(); i++) {
            stringBuilder.append(", " + list.get(i).toString());
        }
        goods = stringBuilder.toString();
        queueCustomers.removeFirst();
        } return goods;
    }
}
