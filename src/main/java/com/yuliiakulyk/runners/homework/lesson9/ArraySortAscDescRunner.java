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
        out.print("Initial array:        ");
        printArrayOneLine(array);
        int[] arrayAscBubble = arraySortAscDesc.sortArrayAscBubble(array);
        out.print("Ascending bubble:     ");
        printArrayOneLine(arrayAscBubble);
        int[] arrayAscSelection = arraySortAscDesc.sortArrayAscSelection(array);
        out.print("Ascending selection:  ");
        printArrayOneLine(arrayAscSelection);
        int[] arrayDescBubble = arraySortAscDesc.sortArrayDescBubble(array);
        out.print("Descending bubble:    ");
        printArrayOneLine(arrayDescBubble);
        int[] arrayDescSelection = arraySortAscDesc.sortArrayDescSelection(array);
        out.print("Descending selection: ");
        printArrayOneLine(arrayDescSelection);
    }
}
