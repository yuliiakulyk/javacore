package com.yuliiakulyk.runners.homework.lesson15;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;

/**
 * Created by Yuliia Kulyk on 21.11.2016.
 */
public class RandomArrayCreator {

    public int[] create (int size) {
        RandomArrayGenerators generators = new RandomArrayGenerators();
        return generators.random1DimensionArray(size, 0, 100);
    }

    public int[][] create (int size1, int size2) {
        RandomArrayGenerators generators = new RandomArrayGenerators();
        return generators.random2DimensionArray(size1, size2, 0, 100);
    }
}
