package com.yuliiakulyk.runners.homework.lesson9;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;
import com.yuliiakulyk.app.homework.lesson9.ArraySortAscDesc;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class ArraySortAscDescRunner {
    public static void main(String[] args) {
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        ArraySortAscDesc arraySortAscDesc = new ArraySortAscDesc();
        int[] array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
        printArrayOneLine(array);
        int[] arrayAsc = arraySortAscDesc.sortArrayAsc(array);
        out.print("Ascending: ");
        printArrayOneLine(arrayAsc);
        int[] arrayDesc = arraySortAscDesc.sortArrayDesc(array);
        out.print("Descending: ");
        printArrayOneLine(arrayDesc);
    }
}
