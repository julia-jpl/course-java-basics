package com.rakovets.course.javabasics.practice.concurrency.censor.forfilescreators;

import java.io.File;
import java.io.IOException;

public class FileCreatorForNewFile {
    public static void main(String[] args) {
        File newFile = new File("E:" + File.separator + "home" + File.separator +"portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "newfile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
