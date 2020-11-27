package com.rakovets.course.javabasics.practice.concurrency.utilities.masterworker;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommonResource {
    Deque<Integer> deque = new ArrayDeque<>();
}
