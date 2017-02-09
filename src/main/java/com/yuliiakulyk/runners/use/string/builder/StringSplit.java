package com.yuliiakulyk.runners.use.string.builder;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class StringSplit {
    public static void main (String [] args) {
        out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Boolean hasDoubleSpaces = true;
        while (hasDoubleSpaces) {
            inputString = inputString.replace("  ", " ");
            int index = inputString.indexOf("  ");
            if (index == -1) {
                hasDoubleSpaces = false;
            }
        }
        String[] splittedStringArray = inputString.split(" ");
        out.println(splittedStringArray.length);
    }

}
