package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.ArrayList;
import java.util.List;

public class CommonResource {
    List<CashDesk> cashDesks = new ArrayList<>();
    public synchronized int chooseQueue() {
        int shortestQueue = cashDesks.get(0).getQueueCustomers().size();
        int numberCashDeskWithShortestQueue = 1;
        for (int i = 0; i < cashDesks.size(); i++) {
            if (shortestQueue > cashDesks.get(i).getQueueCustomers().size()) {
                shortestQueue = cashDesks.get(i).getQueueCustomers().size();
                numberCashDeskWithShortestQueue = i + 1;
            }
        }
        return numberCashDeskWithShortestQueue;
    }
}
