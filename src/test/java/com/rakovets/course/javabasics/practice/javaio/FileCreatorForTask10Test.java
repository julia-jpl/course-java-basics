package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorForTask10Test {
    public static void main(String[] args) {
        File file = new File("src" + File.separator + "test" + File.separator +"resources" + File.separator + "task10.txt");
        try {
            boolean create = file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String javaCode = "public class FileAnalyzeUtil {\n" +
                "\n" +
                "private int age;" + "\n" +
                "private String message;" + "\n" +
                "    public List<String> getListStringsOfFile(String filePath) " +
                "\n" + "}";

        try (FileWriter fr = new FileWriter(file, false)) {
            fr.write(javaCode);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}