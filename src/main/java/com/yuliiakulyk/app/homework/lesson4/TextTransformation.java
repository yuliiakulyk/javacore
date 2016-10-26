package com.yuliiakulyk.app.homework.lesson4;

import static java.lang.System.out;

import java.util.ArrayList;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * Created by 123 on 15.10.2016.
 */
public class TextTransformation {
    public String lowerToUpperCase(String lowerCaseString) {
        String upperCaseString = lowerCaseString.toUpperCase();
        out.println("String in upper case: " + upperCaseString);
        return upperCaseString;
    }

    public char getFirstSymbol(String string1) {
        char firstSymbol = string1.charAt(0);
        out.println("First symbol is: " + firstSymbol);
        return firstSymbol;
    }

    public String removeBracketsAndDashes(String string1) {
        String cleanString;
        cleanString = string1.replaceAll("\\(", "");
        cleanString = cleanString.replaceAll("-", "");
        cleanString = cleanString.replaceAll("\\)", "");
        out.println("Phone number or string without -() is: " + cleanString);
        return cleanString;
    }

    public char getNextLetterInAplpabet(char letter) {
        char nextLetter = letter;
        nextLetter++;
        out.println("Next letter in alphabet for " + letter + " is " + nextLetter + ".");
        return nextLetter;
    }

    public int getSymbolUnicode(char symbol) {
        int unicode = (int) symbol;
        out.println("You can type symbol " + symbol + "using Alt+" + unicode);
        return unicode;
    }

}
