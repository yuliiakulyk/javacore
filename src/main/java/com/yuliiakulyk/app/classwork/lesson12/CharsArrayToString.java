package com.yuliiakulyk.app.classwork.lesson12;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class CharsArrayToString {

    public String charsArrayToString(char[] array) {
        StringBuilder builder = new StringBuilder();
        builder = builder.append(array);
        String string = builder.toString();
        return string;
    }
}
