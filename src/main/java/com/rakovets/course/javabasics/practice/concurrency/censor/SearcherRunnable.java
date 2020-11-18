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
        String commonText = "";
        if (dir.isDirectory()) {
            for (String item : dir.list()) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(item))) {
                    String line;
                    String text = "";
                    StringBuffer stringBuffer = new StringBuffer(text);
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuffer.append(line);
                    }
                    text = stringBuffer.toString().trim();
                    for (String word : text.split("\\W")) {
                        if (word.equalsIgnoreCase(wordForSearch)) {
                            commonText += stringBuffer.toString();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
                try (FileWriter fw = new FileWriter( "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "newfile.txt")) {
                    fw.write(commonText);
                    fw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
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
