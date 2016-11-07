package com.yuliiakulyk.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.yuliiakulyk.runners.utils.Printers.print2DimArray;
import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;

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
    @Test
    @FileParameters(value = "src/test/resources/MultiplicationTable.csv", mapper = CsvWithHeaderMapper.class)
    public void randomCasesMultiplicationTableTest (int numberOfCases) {
        int[] a = new int [numberOfCases * 2];
        int[][] cases = randomArrayGenerators.randomCasesMultiplicationTable(numberOfCases);
        print2DimArray(cases);
        for (int i = 0; i < cases.length; i++) {
            a[2 * i] = 10 * cases[i][0] + cases[i][1];
            a[2 * i + 1] = 10 * cases[i][1] + cases[i][0];
        }
        boolean hasDuplicates = false;
        int numberOfDuplicates;
        for (int i = 0; i < cases.length; i++) {
            numberOfDuplicates = 0;
            for (int j = 0; j < a.length; j++) {
                if (10* cases[i][0] + cases[i][1] == a[j] ) {
                    numberOfDuplicates++;
                }
            }
            if (cases[i][0] == cases[i][1]) {
                numberOfDuplicates-=2;
            }
            if (numberOfDuplicates > 1) {
                hasDuplicates = true;
            }
        }
        Assert.assertEquals(false, hasDuplicates);
    }

}
