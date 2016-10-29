package com.yuliiakulyk.app.classwork.lesson9;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class CharArray {
    public static void main(String[] args) {
        char [] array = new char[256];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) i;
        }
        out.println("Char array:\n" + Arrays.toString(array));
    }
}
