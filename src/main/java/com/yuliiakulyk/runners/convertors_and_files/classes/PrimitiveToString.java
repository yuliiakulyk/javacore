package com.yuliiakulyk.runners.convertors_and_files.classes;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class PrimitiveToString {

    public String intToString(int primitive) {return String.valueOf(primitive);}

    public String doubleToString(double primitive) {return String.valueOf(primitive);}

    public String floatToString(float primitive) {return String.valueOf(primitive);}

    public String longToString(long primitive) {return String.valueOf(primitive);}

    public String booleanToString(boolean primitive) {return String.valueOf(primitive);}

    public int intFromString (String string) {return Integer.valueOf(string);}

    public double doubleFromString (String string) {return Double.valueOf(string);}

    public float floatFromString (String string) {return Float.valueOf(string);}

    public long longFromString (String string) {return Long.valueOf(string);}

    public boolean booleanFromString (String string) {return Boolean.valueOf(string);}

    /* public static void main (String args[]) {
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
    } */
}
