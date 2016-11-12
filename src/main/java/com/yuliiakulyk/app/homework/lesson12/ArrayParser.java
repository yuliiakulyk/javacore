package com.yuliiakulyk.app.homework.lesson12;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class ArrayParser {
    public int[] stringToArray(String string) {
        String[] stringArray = string.split(";");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}
