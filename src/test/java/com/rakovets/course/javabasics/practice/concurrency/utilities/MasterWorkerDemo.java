package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        MasterTask masterTask = new MasterTask(commonResource);
        WorkerTask2 workerTask2 = new WorkerTask2(commonResource);
        WorkerTask1 workerTask1 = new WorkerTask1(commonResource);

        ExecutorService executorMaster = Executors.newSingleThreadExecutor();
        ExecutorService executorWorkers = Executors.newFixedThreadPool(5);
        boolean isRun = true;
        while (isRun) {
            Future<Integer> result = executorMaster.submit(masterTask);
            if (commonResource.deque.peek() != null) {
                executorWorkers.submit(workerTask1);
            } else if ()
            executorWorkers.submit(workerTask2);
            try {
                Integer number = result.get();
                if (number != -1) {
                    commonResource.deque.addLast(number);
                } else {
                    System.out.println("The end.");
                    isRun = false;
                    executorMaster.shutdownNow();
                    executorWorkers.shutdown();
                }
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
