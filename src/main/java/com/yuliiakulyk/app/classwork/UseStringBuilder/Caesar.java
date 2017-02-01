package com.yuliiakulyk.app.classwork.UseStringBuilder;

/**
 * Created by Yuliia Kulyk on 13.11.2016.
 */
public class Caesar {
    private static final String ORIGIN = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 .,?:";
    private static final int SHIFT = 36;

    public String cipher(String string, int shift) {
        StringBuilder builder = new StringBuilder("");
        int index;
        for (int i = 0; i < string.length(); i++) {
            index = ORIGIN.indexOf(string.charAt(i)) + shift;
            if (index < 0 || index > ORIGIN.length() - 1) {
                builder.append(ORIGIN.charAt(index - Math.round(shift / Math.abs(shift)) * ORIGIN.length()));
            } else {
                builder.append(ORIGIN.charAt(index));
            }
        }
        return builder.toString();
    }

    public String encode(String string) { return cipher(string, SHIFT); }

    public String decode(String string) { return cipher(string, -SHIFT); }

}
