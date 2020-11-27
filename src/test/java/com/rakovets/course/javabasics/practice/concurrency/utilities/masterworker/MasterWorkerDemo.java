package com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker;

import com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker.CommonResource;
import com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker.MasterTask;
import com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker.ThreadWorker;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        MasterTask masterTask = new MasterTask(commonResource);
        ThreadWorker threadWorker = new ThreadWorker(commonResource);
        ExecutorService executorMaster = Executors.newSingleThreadExecutor();
        ExecutorService executorWorkers = Executors.newFixedThreadPool(5);
        boolean isRun = true;
        while (isRun) {
            Future<Integer> result = executorMaster.submit(masterTask);
            executorWorkers.submit(threadWorker);
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
