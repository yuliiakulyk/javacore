package com.yuliiakulyk.runners.classwork.lesson13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class FileRead {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.println("Regardless about exception you will see this text.");
        }
    }
}
