package com.yuliiakulyk.runners.arrays_and_sorting;

import com.yuliiakulyk.app.arrays_and_sorting.LoopsArrays;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;

/**
 * Created by Yuliia Kulyk on 27.10.2016.
 */
public class GetEvenOddArrayRunner {
    public static void main(String args[]) {
        LoopsArrays loopsArrays = new LoopsArrays();
        int[] array = loopsArrays.getEvenOddArrayFromTo(-10, 10, true);
        printArrayOneLine(array);
    }

}
