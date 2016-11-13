package com.yuliiakulyk.runners.utils;

import java.util.Scanner;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class KeyboardInput {
    public static String getKeyboardInput() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

}
