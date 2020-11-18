package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.File;
import java.util.Scanner;

public class Censor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirForSearch = "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dirfortests";
        String wordForSearch = scanner.nextLine();
        SearcherRunnable searcher = new SearcherRunnable(dirForSearch, wordForSearch);
        Thread threadSearcher = new Thread(searcher);
        threadSearcher.start();

    }
}
