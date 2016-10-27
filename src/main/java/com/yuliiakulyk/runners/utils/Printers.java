package com.yuliiakulyk.runners.utils;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 27.10.2016.
 */
public class Printers {
    public static void printArrayRightAlignment(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.printf("%5d", array[i]);
        }
        out.println();
    }

    public static void printArraySeparateLines(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.println(array[i]);
        }
    }

    public static void printArrayOneLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.print(array[i] + " ");
        }
        out.println();
    }

    public static void printArrayOneLineReverse(int[] array) {
        for (int i = array.length; i > 0; i--) {
            out.print(array[i - 1] + " ");
        }
        out.println();
    }

    public static void print2DimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArrayOneLine(array[i]);
        }
    }

    public static void print2DimArrayRightAligned(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArrayRightAlignment(array[i]);
        }
    }
}
