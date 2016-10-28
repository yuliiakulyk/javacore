package com.yuliiakulyk.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Yuliia Kulyk on 27.10.2016.
 */

@RunWith(JUnitParamsRunner.class)
public class RandomArrayGeneratorsTest {
    RandomArrayGenerators randomArrayGenerators;

    @Before
    public void preconditionsForTests () {
        randomArrayGenerators = new RandomArrayGenerators();
    }

    @Test
    @FileParameters (value = "src/test/resources/RandomArrayGenerators.csv", mapper = CsvWithHeaderMapper.class)
    public void random1DimensionArrayTest (int elements, int min, int max) {
        boolean isOutOfRange = false;
        int[] array = randomArrayGenerators.random1DimensionArray(elements, min, max);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min || array[i]> max)
                isOutOfRange = true;
        }
        Assert.assertEquals(false, isOutOfRange);
    }
    @Test
    @FileParameters (value = "src/test/resources/Random2DimArrayGenerators.csv", mapper = CsvWithHeaderMapper.class)
    public void random2DimensionArrayTest (int elements1, int elements2, int min, int max) {
        int[][] array = randomArrayGenerators.random2DimensionArray(elements1, elements2, min, max);
        boolean isOutOfRange = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min || array[i][j] > max)
                    isOutOfRange = true;
            }
        }
        Assert.assertEquals(false, isOutOfRange);
    }
}
