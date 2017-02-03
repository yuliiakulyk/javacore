package com.yuliiakulyk.runners.ArraysAndSorting;

import com.yuliiakulyk.app.ArraysAndSorting.RandomArrayGenerators;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;

/**
 * Created by Yuliia Kulyk on 28.10.2016.
 */
public class RandomArrayGeneratorsRunner {
    public static void main(String[] args) {
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        int[] array = randomArrayGenerators.random1DimensionArray(6,0,10);
        printArrayOneLine(array);
    }
}
