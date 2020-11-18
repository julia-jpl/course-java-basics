package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.*;
import java.util.regex.Pattern;

public class SearcherRunnable implements Runnable {
    private String dirForSearch;
    private String wordForSearch;
    public SearcherRunnable (String dirForSearch, String wordForSearch) {
        this.dirForSearch = dirForSearch;
        this.wordForSearch = wordForSearch;
    }

    @Override
    public void run() {
        File dir = new File(dirForSearch);
        if (dir.isDirectory()) {
            for (String item : dir.list()) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(item));
                FileWriter fw = new FileWriter(dirForSearch + File.separator + "newFile.txt", false)) {
                    String line;
                    String text ="";
                    while ((line = bufferedReader.readLine()) != null) {
                        text = text + line;
                    }
                    boolean found = Pattern.matches(wordForSearch, text);
                    if (found) {
                        fw.write(text);
                        fw.flush();
                        }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
