package com.yuliiakulyk.runners.convertors.and.files.classes;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class CharsToStringRunner {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd'};
        String string = CharsToString.charArrayToString(charArray);
        out.println(string);
    }
}
