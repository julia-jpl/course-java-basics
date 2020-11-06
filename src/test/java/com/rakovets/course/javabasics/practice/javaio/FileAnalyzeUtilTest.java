package com.rakovets.course.javabasics.practice.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileAnalyzeUtilTest {
    private static FileAnalyzeUtil fileAnalyzeUtil;
    private static List<String> listTask2;
    private List<String> listTask3;
    private List<String> listTask4;
    private Map<Character, Integer> mapTask6;
    private Map<String, Integer> mapTask7;

    @BeforeEach
    void init() {
        fileAnalyzeUtil = new FileAnalyzeUtil();
        String[] arrayTask2 = new String[] {"23 24 64", "56 87 1 2 3", "34 46 9 7 8 10", "asdd"};
        String[] arrayTask3 = new String[] {"is", "Apple", "is", "are", "interested", "in"};
        String[] arrayTask4 = new String[] {"test", "is", "Apple", "RosE"};
        listTask2 = new LinkedList<>(Arrays.asList(arrayTask2));
        listTask3 = new LinkedList<>(Arrays.asList(arrayTask3));
        listTask4 = new LinkedList<>(Arrays.asList(arrayTask4));
        mapTask6 = new HashMap<>();
        mapTask6.put('t', 3);
        mapTask6.put('e', 1);
        mapTask6.put('s', 4);
        mapTask6.put('i', 2);
        mapTask6.put('a', 1);
        mapTask6.put('k', 1);
        mapTask6.put('l', 2);
        mapTask6.put('o', 1);
        mapTask6.put('w', 1);
        mapTask6.put('y', 1);
        mapTask6.put('b', 1);
        mapTask6.put('g', 1);
        mapTask7 = new HashMap<>();
        mapTask7.put("test", 2);
        mapTask7.put("is", 2);
        mapTask7.put("big", 2);
        mapTask7.put("day", 2);
        mapTask7.put("Test", 1);
        mapTask7.put("task", 1);
        mapTask7.put("slowly", 1);
        }

    @Test
    void getListStringsOfFileTest() {
        try {
            Assertions.assertEquals(listTask2,  fileAnalyzeUtil.getListStringsOfFile("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task02.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getListOfWordsStartedWithVowelTest() {
        try {
            Assertions.assertEquals(listTask3, fileAnalyzeUtil.getListOfWordsStartedWithVowel("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task03.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getListOfWordsTest() {
        try {
            Assertions.assertEquals(listTask4, fileAnalyzeUtil.getListOfWords("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task04.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getFrequencyOfLettersTest() {
        try {
            Assertions.assertEquals(mapTask6, fileAnalyzeUtil.getFrequencyOfLetters("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "task06.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getFrequencyOfWordsTest() {
        try {
            Assertions.assertEquals(mapTask7, fileAnalyzeUtil.getFrequencyOfWords("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "task07.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getSortedNumbersTest() {
        try {
            fileAnalyzeUtil.getSortedNumbers("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task08.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void getReplacedModifiersTest() {
        try {
            fileAnalyzeUtil.getReplacedModifiers("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task10.txt", "private", "public");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
