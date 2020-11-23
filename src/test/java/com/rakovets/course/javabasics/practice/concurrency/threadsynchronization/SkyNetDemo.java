package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SkyNetDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        CommonList res = new CommonList(linkedList);
        Factory factory = new Factory(res);
        Thread threadFactory = new Thread(factory);
        World world = new World(res);
        Thread threadWorld = new Thread(world);
        Wednesday wednesday = new Wednesday(res);
        Thread threadWednesday = new Thread(wednesday);
            threadFactory.start();
            threadWorld.start();
            threadWednesday.start();
        }


}
