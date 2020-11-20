package com.rakovets.course.javabasics.practice.concurrency.masterworker;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        MasterThread masterThread = new MasterThread(commonResource);
        Thread threadM = new Thread(masterThread);
        threadM.start();

        ThreadWorker threadWorker = new ThreadWorker(commonResource);
        Thread threadW = new Thread(threadWorker);
        threadW.setDaemon(true);
        threadW.start();
    }
}

