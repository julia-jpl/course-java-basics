package com.rakovets.course.javabasics.practice.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FileAnalyzeUtil {

    public void getListStringsOfFile(String path) {
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            List<String> list = new LinkedList<>();
            String s;
            while ((s = bf.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getListOfWordsStartedWithVowel(String path) {
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            List<String> list = new LinkedList<>();
            char[] vowels = new char[]{'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y', 'А', 'а', 'Е', 'е', 'Ё', 'ё', 'И', 'и', 'О', 'о', 'У', 'у', 'ы', 'Э', 'э', 'Ю', 'ю', 'Я', 'я'};
            String text = null;
            int c;
            while ((c = bf.read()) != -1) {
                text += (char) c;
            }
            if (text != null) {
                String  text1 = text.trim();
                for (String word : text1.split("\\W+")) {
                    for (char vowel : vowels) {
                        if (word.charAt(0) == vowel) {
                            list.add(word);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void getListOfWords(String path) {
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            List<String> list = new LinkedList<>();
            String text = null;
            int c;
            while ((c = bf.read()) != -1) {
                text += (char) c;
            }
            if (text != null) {
                String text1 = text.trim();
                String[] words = text1.split("\\W+");
                for (int i = 0; i < words.length; i++) {
                    int size = words[i].length();
                    if (words[i].charAt(size - 1) == words[i +1].charAt(0)) {
                        list.add(words[i]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getFrequencyOfWords(String path) {
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> wordsFrequency = new HashMap<>();
            String line;
            String text = "";
            while ((line = bf.readLine()) != null) {
                text += line;
            }
            if ((text != null) && (text != "")) {

            }
    }
}
