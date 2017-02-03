package com.yuliiakulyk.app.ArraysAndSorting;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class CharArray {
    public char[] getArrayChar (int quantity) {
        char [] array = new char[quantity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) i;
        }
        out.println("Char array:\n" + Arrays.toString(array));
        return array;
    }
}
