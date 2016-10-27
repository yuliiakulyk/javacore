package com.yuliiakulyk.runners.homework.lesson7;

import com.yuliiakulyk.app.homework.lesson7.LoopsArrays;

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
