package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.util.Scanner;

public class Censor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirForSearch = scanner.nextLine();
        String wordForSearch = scanner.nextLine();
        SearcherRunnable searcher = new SearcherRunnable(dirForSearch, wordForSearch);
        Thread threadSearcher = new Thread(searcher);
        threadSearcher.start();

    }
}
