package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.*;

public class FileAnalyzeUtil {

    public List<String> getListStringsOfFile(String filePath) {
        List<String> list = new LinkedList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
           String s;
            while ((s = bf.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return list;
    }

    public List<String> getListOfWordsStartedWithVowel(String filePath) {
        List<String> list = new LinkedList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            char[] vowels = new char[]{'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y', 'А', 'а', 'Е', 'е', 'Ё', 'ё', 'И', 'и', 'О', 'о', 'У', 'у', 'ы', 'Э', 'э', 'Ю', 'ю', 'Я', 'я'};
            String text = null;
            int c;
            while ((c = bf.read()) != -1) {
                text += (char) c;
            }
            if (text != null) {
                String text1 = text.trim();
                for (String word : text1.split("\\W+")) {
                    for (char vowel : vowels) {
                        if (word.charAt(0) == vowel) {
                            list.add(word);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return list;
    }
    public List<String> getListOfWords(String filePath) {
        List<String> list = new LinkedList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
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
                        if (words[i].charAt(size - 1) == words[i + 1].charAt(0)) {
                            list.add(words[i]);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return list;
    }

    public Map<Character, Integer> getFrequencyOfLetters(String filePath) {
        Map<Character, Integer> lettersFrequency = new HashMap<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lettersFrequency;
    }

    public Map<String, Integer> getFrequencyOfWords(String filePath) {
        Map<String, Integer> wordsFrequency = new HashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
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
            for (Map.Entry<String, Integer> item : list) {
                sortedMap.put(item.getKey(), item.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return sortedMap;
    }

    public void getSortedNumbers(String filePath) {
        String filePathNew = filePath.replace(".txt", "_.txt");
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePathNew))) {
            StringBuilder text = new StringBuilder();
            int c;
            while ((c = bf.read()) != -1) {
                text.append((char) c);
            }
            String text1 = text.toString();
            if ((text1 != null) && (text1 != "")) {
                String text2 = text1.trim();
                String[] words = text2.split(" +");
                int[] wordsInt = new int[words.length];
                for (int i = 0; i < wordsInt.length; i++) {
                    wordsInt[i] = Integer.parseInt(words[i]);
                }
                Arrays.sort(wordsInt);
                File file = new File(filePathNew);
                try {
                    boolean create = file.createNewFile();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                for (int item : wordsInt) {
                    bw.write(item + " ");
                    bw.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Map<String, Double> getAcademicPerformance(String filePath) {
        Map<String, Double> academicPerformance = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String surname = "";
            String marks = "";
            int indexOfFirstComma = -1;
            double averageMark = 0;
            int sumOfMarks = 0;
            while ((line = br.readLine()) != null) {
                indexOfFirstComma = line.indexOf(',');
                surname = line.substring(0, indexOfFirstComma);
                marks = line.substring(indexOfFirstComma + 1);
                String[] arrayOfMarks = marks.split(",");
                int[] arrayOfMarksInt = new int[arrayOfMarks.length];
                for (int i = 0; i < arrayOfMarksInt.length; i++) {
                    arrayOfMarksInt[i] = Integer.parseInt(arrayOfMarks[i]);
                }
                for (int item : arrayOfMarksInt) {
                    sumOfMarks += item;
                }
                averageMark = (double) sumOfMarks / arrayOfMarksInt.length;
                averageMark = (double) Math.round(averageMark * 100) / 100;
                academicPerformance.put(surname, averageMark);
                averageMark = 0;
                sumOfMarks = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return academicPerformance;
    }
    public void getReplacedModifiers(String filePath, String oldModifier, String newModifier) {
        String filePathNew = filePath.replace(".txt", "_.txt");
        String line;
        String newLine;
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePathNew))) {
            File file = new File(filePathNew);
            try {
                boolean create = file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            while ((line = bf.readLine()) != null) {
                newLine = line.replace(oldModifier, newModifier);
                bw.write(newLine + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
