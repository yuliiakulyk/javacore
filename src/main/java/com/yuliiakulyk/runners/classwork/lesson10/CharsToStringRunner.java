package com.yuliiakulyk.runners.classwork.lesson10;
import com.yuliiakulyk.app.utils.convertors.CharsToString;

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
