package com.yuliiakulyk.runners.classwork.lesson19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Yuliia Kulyk on 03.12.2016.
 */
public class ListOfWords {
    public static void main(String[] args) {
        System.out.println("Please enter words. Type \"exit\" to save the words.");
        Scanner scanner = new Scanner(System.in);
        String word;
        ArrayList<String> set = new ArrayList<>();
        do {
            word = scanner.next();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            set.add(word);
        } while (true);
        HashSet<String> hashSet = new HashSet<>(set);
        System.out.println(set.toString());
    }
}
