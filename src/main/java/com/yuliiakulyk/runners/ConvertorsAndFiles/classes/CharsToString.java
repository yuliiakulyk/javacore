package com.yuliiakulyk.runners.ConvertorsAndFiles.classes;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class CharsToString {
    public static String charArrayToString (char[] charArray) {
        String string = "";
        for (int i = 0; i < charArray.length; i++) {
            string = string + charArray[i];
        }
        return string;
    }
}
