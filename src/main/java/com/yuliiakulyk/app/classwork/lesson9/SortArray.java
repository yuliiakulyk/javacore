package com.yuliiakulyk.app.classwork.lesson9;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 4, 2, 1, 3, 888, 0, 6, 5, 0, 10, 13, -3, -100};
        out.print("Original array: ");
        printArrayOneLine(array);
        int exchange;
        int k;
        do {
            exchange = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                    exchange++;
                }
            }
        } while (exchange > 0);
        out.print("  Sorted array: ");
        printArrayOneLine(array);
    }
}
