package com.yuliiakulyk.app.homework.lesson7;

/**
 * Created by Yuliia Kulyk on 27.10.2016.
 */
public class RandomArrayGenerators {
    public int[] random1DimensionArray(int elements, int min, int max) {
        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max - min + 1));
        }
        return array;
    }

    public int[][] random2DimensionArray(int elements1, int elements2, int min, int max) {
        int[][] array = new int[elements1][elements2];
        for (int i = 0; i < elements1; i++) {
            array[i] = random1DimensionArray(elements2, min, max);
        }
        return array;
    }
}
