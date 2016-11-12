package com.yuliiakulyk.app.classwork.lesson12;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class Enigma {
    private static final String ORIGIN = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 .,?:";
    private static final String CODE = ":?,. 0987654321zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA";
    public String encode(String string) {
        return cipher(string, ORIGIN, CODE);
    }

    public String decode (String string) {
        return cipher(string, CODE, ORIGIN);
    }

    public String cipher (String string, String fromCharacters, String toCharacters) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < string.length(); i++) {
            stringBuilder = stringBuilder.append(toCharacters.charAt(fromCharacters.indexOf(string.charAt(i))));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Enigma enigma = new Enigma();
        String string = "Why do you cry, Willy, why do you cry? Why, Willy, why, Willy, why, Willy, why?";
        String encodedString = enigma.encode(string);
        out.println(encodedString);
        out.println(enigma.decode(encodedString));
    }
}
