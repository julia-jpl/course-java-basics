package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResetRunnable implements Runnable {
    private String filePathForbiddenWords;
    private String filePathNewFile;
    public ResetRunnable (String filePathForbiddenWords, String filePathNewFile) {
        this.filePathForbiddenWords = filePathForbiddenWords;
        this.filePathNewFile = filePathNewFile;
    }

    @Override
    public void run() {
        List<String> forbiddenWords = ResetRunnable.getForbiddenWords(filePathForbiddenWords);
        try (BufferedReader br = new BufferedReader(new FileReader(filePathNewFile));
             FileWriter fr = new FileWriter(filePathNewFile, false)) {
            String line;
            String text = "";
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W");
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < forbiddenWords.size(); j++) {
                        if (words[i].compareTo(forbiddenWords.get(j)) != 0) {
                            fr.write(words[i] + ", ");
                            fr.flush();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> getForbiddenWords(String filePathForbiddenWords) {
        List<String> forbiddenWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePathForbiddenWords))) {
            String line;
            String text = "";
            while ((line = br.readLine()) != null) {
                text += line + " ";
            }
            String text1 = text.trim();
            forbiddenWords = Arrays.asList(text1.split("\\W"));
        } catch (IOException e) {
            e.printStackTrace();
        } return forbiddenWords;
    }
}
