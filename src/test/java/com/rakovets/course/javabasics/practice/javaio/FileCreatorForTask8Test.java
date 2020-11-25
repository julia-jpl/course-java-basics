package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForTask8Test {
    public static void main(String[] args) {
        File file = new File("src" + File.separator + "test" + File.separator +"resources" + File.separator + "task08.txt");
        try {
            boolean create = file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String numbers = "23 56 78 0 7  5 3";

        try (FileWriter fr = new FileWriter(file, false)) {
                fr.write(numbers);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
