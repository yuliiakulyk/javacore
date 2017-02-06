package com.yuliiakulyk.app.arrays_and_sorting;


/**
 * Created by Yuliia Kulyk on 27.10.2016.
 */

public class RandomArrayGenerators {
    public int[] random1DimensionArray(int elements, int min, int max) {
        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.round(Math.random() * (max - min)));
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

    public int[][] randomCasesMultiplicationTable(int quantity) {
        int[][] cases = new int[quantity][2];
        cases[0] = random1DimensionArray(2, 2, 9);
        boolean isUnique;
        LoopsArrays loopsArrays = new LoopsArrays();
        for (int i = 1; i < cases.length; i++) {
            do {
                isUnique = true;
                cases[i] = random1DimensionArray(2, 2, 9);
                for (int j = 0; j < i; j++) {
                    int equal = loopsArrays.equalPositiveElementsIn2Arrays(cases[i], cases[j]);
                    if (equal == 2) {
                        isUnique = false;
                    }
                }
            } while (isUnique == false);
        }
        return cases;
    }

}
