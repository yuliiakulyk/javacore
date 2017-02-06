package com.yuliiakulyk.runners.convertors_and_files.classes;

import com.yuliiakulyk.app.work_with_string.Palindrome;

import java.io.*;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class WritePalindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/test/resources/output.txt")));
            BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {

                    try {
                        if (palindrome.isPalindrome1(line)) {
                            writer.append(line);
                            writer.append(" - is a palindrome.");
                            writer.newLine();
                        } else {
                            writer.append(line);
                            writer.append(" - is not a palindrome.");
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}