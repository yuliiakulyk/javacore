package com.yuliiakulyk.app.utils.convertors;

public class PrimitiveConvertor {

    public char floatToChar(float floatInputValue) {
        char charFromFloat = (char) floatInputValue;
        System.out.println("Input float value is " + floatInputValue + ". Output char value is " + charFromFloat);
        return charFromFloat;
    }

    public char intToChar(int intInputValue) {
        char charFromInt = (char) intInputValue;
        System.out.println("Input int value is " + intInputValue + ". Output char value is " + charFromInt);
        return charFromInt;
    }

    public int charToInt(char charInputValue) {
        int intFromChar = (int) charInputValue;
        System.out.println("Input char value is " + charInputValue + ". Output int value is " + intFromChar);
        return intFromChar;
    }

}
