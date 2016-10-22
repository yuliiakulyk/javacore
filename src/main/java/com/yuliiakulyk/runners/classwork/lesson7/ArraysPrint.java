package com.yuliiakulyk.runners.classwork.lesson7;

import static java.lang.System.out;

/**
 * Created by 123 on 22.10.2016.
 */
public class ArraysPrint {
    public static void main(String[] args) {
        boolean [] arrayBoolean = {true, true, false};
        for ( int i = 0; i < arrayBoolean.length; i++) {
            out.println(arrayBoolean[i]);
        }
        char [] arrayChar = {'a', 'b', 'c'};
        for ( int i = 0; i < arrayChar.length; i++) {
            out.println(arrayChar[i]);
        }
        double [] arrayDouble = {1.22, 3.66, 9.99};
        for ( int i = 0; i < arrayDouble.length; i++) {
            out.println(arrayDouble[i]);
        }
    }
}
