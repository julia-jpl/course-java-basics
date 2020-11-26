package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock lock = new ReentrantLock();
        MasterThread masterThread = new MasterThread(commonResource);
        Thread threadM = new Thread(masterThread);
        threadM.start();
        for (int i = 1; i <= 3; i++) {
            Thread threadW = new Thread(new ThreadWorker (commonResource, lock));
            threadW.setName("Worker" + i);
            threadW.setDaemon(true);
            threadW.start();
        }
    }
}
