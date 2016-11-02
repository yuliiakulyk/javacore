package com.yuliiakulyk.app.utils.convertors;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class PrimitiveToString {
    public static void main (String args[]) {
        String myInt = String.valueOf(1);
        String myDouble = String.valueOf(1.2345d);
        String myFloat = String.valueOf(1.23f);
        String myLong = String.valueOf(19999L);
        String myBoolean = String.valueOf(true);
        out.println(myInt + " " + myDouble + " "  + myFloat + " " + myLong + " " + myBoolean);
        int intFromString = Integer.valueOf(myInt);
        double doubleFromString = Double.valueOf(myDouble);
        float floatFromString = Float.valueOf(myFloat);
        long longFromString = Long.valueOf(myLong);
        boolean booleanFromString = Boolean.valueOf(myBoolean);
        out.println(intFromString + " " + doubleFromString + " "  + floatFromString + " " + longFromString + " " + booleanFromString);
    }
}
