package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;


public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producer = new ProducerThread(store);
        ConsumerThread consumerThread = new ConsumerThread(store);
        new Thread(producer).start();
        new Thread(consumerThread).start();
    }
}
