package com.rakovets.course.javabasics.practice.concurrency;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirForSearch = scanner.nextLine();
        String wordForSearch = scanner.nextLine();
        File dir = new File(dirForSearch);
        if (dir.isDirectory()) {
            String commonText = "";
            for (String item : dir.list()) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(item))) {
                    String line;
                    String text = "";
                    StringBuffer stringBuffer = new StringBuffer(text);
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuffer.append(line);
                    }
                    boolean found = Pattern.matches(wordForSearch, stringBuffer.toString());
                    if (found) {
                        commonText += stringBuffer.toString();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try (FileWriter fw = new FileWriter( "E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "newfile.txt")) {
                    fw.write(commonText);
                    fw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
