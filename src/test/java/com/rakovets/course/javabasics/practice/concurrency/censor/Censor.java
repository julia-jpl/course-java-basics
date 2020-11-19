package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.File;
import java.util.Scanner;

public class Censor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirForSearch = "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dirfortests";
        String wordForSearch = scanner.nextLine();
        String filePathNewFile = "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "newfile.txt";
        String filePathForbiddenWords = "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "forbiddenwords.txt";
        SearcherRunnable searcher = new SearcherRunnable(dirForSearch, wordForSearch);
        Thread threadSearcher = new Thread(searcher);
        ResetRunnable resetRunnable = new ResetRunnable(filePathForbiddenWords, filePathNewFile);
        Thread threadRemover = new Thread(resetRunnable);
        threadSearcher.start();
        threadRemover.start();
        try {
            threadSearcher.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
