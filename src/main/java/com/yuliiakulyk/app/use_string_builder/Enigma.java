package com.yuliiakulyk.app.use_string_builder;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class Enigma {
    private static final String ORIGIN = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 .,?:";
    private static final String CODE = ":?,. 0987654321zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA";

    public String encode(String string) {
        return cipher(string, ORIGIN, CODE);
    }

    public String decode(String string) {
        return cipher(string, CODE, ORIGIN);
    }

    public String cipher(String string, String fromCharacters, String toCharacters) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < string.length(); i++) {
            stringBuilder = stringBuilder.append(toCharacters.charAt(fromCharacters.indexOf(string.charAt(i))));
        }
        return stringBuilder.toString();
    }

}
