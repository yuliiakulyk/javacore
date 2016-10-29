package com.yuliiakulyk.runners.homework.lesson7;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;

/**
 * Created by Yuliia Kulyk on 28.10.2016.
 */
public class RandomArrayGeneratorsRunner {
    public static void main(String[] args) {
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        int[] array = randomArrayGenerators.random1DimensionArray(15,0,9);
        printArrayOneLine(array);
    }
}
