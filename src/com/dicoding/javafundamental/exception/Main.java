package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] rags) {
        try {
            String location = "D://namafile.txt";
            File file = new File(location);
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
