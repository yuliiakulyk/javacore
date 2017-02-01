package com.yuliiakulyk.app.classwork.ArraysAndSorting;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class SortArray {
    public int[] sortArrayBubble(int[] array) {
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
        return array;
    }
}
