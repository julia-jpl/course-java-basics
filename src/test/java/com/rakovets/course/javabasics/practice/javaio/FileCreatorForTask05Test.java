package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForTask05Test {
    public static void main(String[] args) {
        File file = new File( "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task05.txt");
        try {
            boolean create = file.createNewFile();
            if (create) {
                System.out.println("File is created");
            } else {
                System.out.println("File is not exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] array = new String[] {"12 34  56 1 2\n", "45 34 36   38 12\n", "9 11 1 4 5 \n", "67 23 22 11"};

        try (FileWriter fr = new FileWriter(file, false)) {
            for (String item : array) {
                fr.write(item);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
