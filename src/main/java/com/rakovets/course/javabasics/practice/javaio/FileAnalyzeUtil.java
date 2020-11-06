package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.*;

public class FileAnalyzeUtil {

    public List<String> getListStringsOfFile(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
            List<String> list = new LinkedList<>();
            String s;
            while ((s = bf.readLine()) != null) {
                list.add(s);
            } bf.close();
            return list;
    }

    public List<String> getListOfWordsStartedWithVowel(String filePath) throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
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
            } bf.close();
            return list;
    }
    public List<String> getListOfWords(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
            List<String> list = new LinkedList<>();
            String text = null;
            int c;
            while ((c = bf.read()) != -1) {
                text += (char) c;
            }
            if (text != null) {
                String text1 = text.trim();
                String[] words = text1.split("\\W+");
                for (int i = 0; i < (words.length - 1); i++) {
                    if ((words[i] != "") && (words[i + 1] != "")) {
                    int size = words[i].length();
                    if (words[i].charAt(size - 1) == words[i +1].charAt(0)) {
                        list.add(words[i]);
                    }
                    }
                }
            } bf.close();
            return list;
    }
    public List<String> getMaxCombination(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
        List<String> list = new LinkedList<>();
        String line;
        while ((line = bf.readLine()) != null) {
            line = line.trim();
            String[] numbers = line.split(" +");
            String combination = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].compareTo(numbers[i + 1]) < 0) {


                }
            }
        }
        return list;
    }

    public Map<Character, Integer> getFrequencyOfLetters(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
        Map<Character, Integer> lettersFrequency = new HashMap<>();
        String line;
        while ((line = bf.readLine()) != null) {
            line = line.toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                if ((line.charAt(i) >= 'a') && (line.charAt(i) <= 'z')) {
                    if (lettersFrequency.containsKey(line.charAt(i))) {
                        lettersFrequency.put(line.charAt(i), lettersFrequency.get(line.charAt(i)) + 1);
                    } else {
                        lettersFrequency.put(line.charAt(i), 1);
                    }
                }
            }
        } return lettersFrequency;
    }

    public Map<String, Integer> getFrequencyOfWords(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
            Map<String, Integer> wordsFrequency = new HashMap<>();
            String line;
            String text = "";
            while ((line = bf.readLine()) != null) {
                text += line;
            }
            if ((text != null) && (text != "")) {
                String text1 = text.trim();
                for (String word : text1.split("\\W+")) {
                    if (wordsFrequency.containsKey(word)) {
                        wordsFrequency.put(word, wordsFrequency.get(word) + 1);
                    } else {
                        wordsFrequency.put(word, 1);
                    }
                }
            }
            List<Map.Entry<String, Integer>> list = new LinkedList<>(wordsFrequency.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
            });
            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> item : list) {
                sortedMap.put(item.getKey(), item.getValue());
            }
            bf.close();
            return sortedMap;
    }

    public void getSortedNumbers(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
        StringBuilder text = new StringBuilder();
        int c;
        while ((c = bf.read()) != -1) {
            text.append((char) c);
        }
        String text1 = text.toString();
        if ((text1 != null) && (text1 != "")) {
            String text2 = text1.trim();
            String[] words = text2.split(" +");
            int [] wordsInt = new int[words.length];
            for (int i = 0; i < wordsInt.length; i++) {
                wordsInt[i] = Integer.parseInt(words[i]);
            }
            Arrays.sort(wordsInt);
            String filePathNew = filePath.replace(".txt", "_.txt");
            File file = new File(filePathNew);
            try {
                boolean create = file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePathNew));
            for (int item : wordsInt) {
                bw.write(item + " ");
                bw.flush();
            }
        }
    }
    public void getReplacedModifiers(String filePath, String oldModifier, String newModifier) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
        String filePathNew = filePath.replace(".txt", "_.txt");
        File file = new File(filePathNew);
        try {
            boolean create = file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePathNew));
        String line;
        String newLine;
        while ((line = bf.readLine()) != null) {
            newLine = line.replace(oldModifier, newModifier);
            bw.write(newLine + "\n");
        } bw.flush();
    }
}
