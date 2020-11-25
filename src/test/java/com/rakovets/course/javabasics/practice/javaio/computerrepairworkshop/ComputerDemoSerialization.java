package com.rakovets.course.javabasics.practice.javaio.computerrepairworkshop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ComputerDemoSerialization {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src" + File.separator + "test" + File.separator +"resources" + File.separator + "computer.data"))) {
            Computer computer1 = new Computer("hp", "15s-eq0045u5", "5cD0298QKF");
            oos.writeObject(computer1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
