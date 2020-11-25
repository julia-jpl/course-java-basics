package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForTask07Test {
    public static void main(String[] args) {
        File test = new File("src" + File.separator + "test" + File.separator + "resources" + File.separator + "task07.txt");
        try {
            boolean create = test.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] array = new String[]{"Test, task, is, slowly, big day day big is, test test"};

        try (FileWriter fr = new FileWriter(test, false)) {
            for (String item : array) {
                fr.write(item);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
