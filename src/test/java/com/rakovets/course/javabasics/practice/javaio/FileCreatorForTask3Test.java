package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForTask3Test {
    public static void main(String[] args) {
        File test = new File( "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task03.txt");
        try {
            boolean create = test.createNewFile();
            if (create) {
                System.out.println("File is created");
            } else {
                System.out.println("File is not exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] array = new String[] {"this task is very big\n", "Apple is tasty.\n", "we are interested in java.\n"};

        try (FileWriter fr = new FileWriter(test, false)) {
            for (String item : array) {
                fr.write(item);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
