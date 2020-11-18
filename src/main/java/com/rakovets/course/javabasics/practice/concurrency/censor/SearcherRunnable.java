package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.*;
import java.util.Scanner;
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
            for (File item : dir.listFiles()) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(item.getAbsolutePath()));
                     FileWriter fw = new FileWriter("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "newfile.txt", true)) {
                    String line = "";
                    String text = "";
                    StringBuffer stringBuffer = new StringBuffer(text);
                    while ((line = bufferedReader.readLine()) != null) {
                        text = line.trim();
                        for (String word : text.split("\\W")) {
                            if (word.equals(wordForSearch)) {
                                fw.write(line + "\n");
                                fw.flush();
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    public String getDirForSearch() {
        return dirForSearch;
    }

    public String getWordForSearch() {
        return wordForSearch;
    }

    public void setDirForSearch(String dirForSearch) {
        this.dirForSearch = dirForSearch;
    }

    public void setWordForSearch(String wordForSearch) {
        this.wordForSearch = wordForSearch;
    }
}
