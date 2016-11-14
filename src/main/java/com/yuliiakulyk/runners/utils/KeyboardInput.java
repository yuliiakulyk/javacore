package com.yuliiakulyk.runners.utils;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class KeyboardInput {
    public static String getKeyboardInput() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static String[] consoleToStringArray (String exitWord) {
        String input;
        ArrayList<String> arrayList = new ArrayList();
        boolean doAgain = true;
        do {
            out.println("Enter a line. Type \"" + exitWord + "\" to stop adding lines and save to file.");
            input = getKeyboardInput();
            if (input.equals(exitWord)) {
                break;
            }
            arrayList.add(input);
        } while (true);
        return arrayList.toArray(new String[arrayList.size()]);
    }

}
