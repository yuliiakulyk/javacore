package com.yuliiakulyk.app.use_string_builder;

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