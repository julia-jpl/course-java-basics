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
    private String filePathCensored;
    public ResetRunnable (String filePathForbiddenWords, String filePathNewFile, String filePathCensored) {
        this.filePathForbiddenWords = filePathForbiddenWords;
        this.filePathNewFile = filePathNewFile;
        this.filePathCensored = filePathCensored;
    }

    @Override
    public void run() {
        List<String> forbiddenWords = ResetRunnable.getForbiddenWords(filePathForbiddenWords);
        try (BufferedReader br = new BufferedReader(new FileReader(filePathNewFile));
             FileWriter fr = new FileWriter(filePathCensored, false)) {
            String line;
            String text = "";
            List<String> censoredWords = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W");
                censoredWords.addAll(Arrays.asList(words));
                for (int i = 0; i < censoredWords.size(); i++) {
                    for (int j = 0; j < forbiddenWords.size(); j++) {
                        if (censoredWords.get(i).equals(forbiddenWords.get(j)) ||
                                censoredWords.get(i).equals(" ") || censoredWords.get(i).equals(",")) {
                            censoredWords.remove(censoredWords.get(i));
                        }
                    }
                }
            }
            fr.write(censoredWords.toString());
            fr.flush();
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
