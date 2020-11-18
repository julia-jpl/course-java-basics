package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForFilesWithWords {
    public static void main(String[] args) {
        File file1 = new File("E:" + File.separator + "home" + File.separator +"portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dirfortests" + File.separator + "file1forsearch.txt");
        File file2 = new File("E:" + File.separator + "home" + File.separator +"portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dirfortests" + File.separator + "file2forsearch.txt");
        File file3 = new File("E:" + File.separator + "home" + File.separator +"portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dirfortests" + File.separator + "file3forsearch.txt");
        File forbiddenWords = new File("E:" + File.separator + "home" + File.separator +"portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "forbiddenwords.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw1 = new FileWriter(file1, false)) {
            String text1 = "The weather is cold. Sun, fog, rain, snow, sky, moon. One, two, three, four, five, six, seven.";
            fw1.write(text1);
            fw1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw2 = new FileWriter(file2, false)) {
            String text2 = "One, two, three, four, five, six, seven, eight, nine, ten. We, you, they, I, he, she. Sun, fog, rain, snow.";
            fw2.write(text2);
            fw2.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw3 =new FileWriter(file3, false)) {
            String text3 = "five, six, seven, eight, nine, ten. We, you, they, I, he, she. Sun, fog.";
            fw3.write(text3);
            fw3.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            forbiddenWords.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw4 = new FileWriter(forbiddenWords, false)) {
            String[] words = new String[] {"six\n", "Sun\n", "she\n", "seven\n"};
            for (String word : words) {
                fw4.write(word);
                fw4.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
