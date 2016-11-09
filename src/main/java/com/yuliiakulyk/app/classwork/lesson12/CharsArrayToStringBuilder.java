package com.yuliiakulyk.app.classwork.lesson12;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class CharsArrayToStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        builder = builder.append(charArray);
        String string = builder.toString();
        out.println(string);
    }
}
