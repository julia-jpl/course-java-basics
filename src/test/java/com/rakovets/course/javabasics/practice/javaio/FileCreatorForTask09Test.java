package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForTask09Test {
    public static void main(String[] args) {
        File file = new File( "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator +"resources" + File.separator + "task09.txt");
        try {
            boolean create = file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] list = new String[] {"Black,3,5,10,7,4,5\n", "Brown,7,7,7,7,3,10\n", "White,10,10,9,9,8,10\n"};

        try (FileWriter fr = new FileWriter(file, false)) {
            for (String item : list) {
                fr.write(item);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
