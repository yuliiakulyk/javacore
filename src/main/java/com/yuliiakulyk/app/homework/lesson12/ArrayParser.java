package com.yuliiakulyk.app.homework.lesson12;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class ArrayParser {
    public int[] stringToIntArray(String string, String separator) {
        String[] stringArray = string.split(separator);
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public String[] stringToStringArray (String string, String separator) {
        String[] stringArray = string.split(separator);
        return stringArray;
    }

    public String alphabetFromStringArray (String[] stringArray) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < stringArray.length; i++) {
            int ascii = (int) stringArray[i].charAt(0);
            if (stringArray[i].length() == 1 && (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122)) {
                builder.append(stringArray[i]);
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}
