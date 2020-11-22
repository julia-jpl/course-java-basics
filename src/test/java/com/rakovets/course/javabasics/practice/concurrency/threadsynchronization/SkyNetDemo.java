package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.*;

public class SkyNetDemo {
    public static void main(String[] args) {
        CommonList res = new CommonList();
        RobotWednesday storeWednesday = new RobotWednesday();
        RobotWorld storeWorld = new RobotWorld();
        Factory factory = new Factory(res);
        Thread threadFactory = new Thread(factory);
        World world = new World(res);
        Thread threadWorld = new Thread(world);
        Wednesday wednesday = new Wednesday(res);
        Thread threadWednesday = new Thread(wednesday);
        for (int i = 1; i <= 100; i++) {
            threadFactory.start();
            threadWednesday.start();
            threadWorld.start();
        }
    }
}
