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
public class LoopsArraysDataDrivenTest {
    LoopsArrays loopsArrays;

    @Before
    public void preConditionsForClass () {
        loopsArrays = new LoopsArrays();
    }

    @Test
    @FileParameters(value = "src/test/resources/LoopsArraysGetArray.csv", mapper = CsvWithHeaderMapper.class)
    public void getEvenOddArrayFromToTest (int min, int max, boolean isEven) {
        int [] array = loopsArrays.getEvenOddArrayFromTo(min, max, isEven);
        boolean expRes = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min || array[i] > max ) {
                expRes = false;
            }
        }
        Assert.assertEquals(expRes, true);
    }

    @Test
    @FileParameters(value = "src/test/resources/LoopsArraysEven.csv", mapper = CsvWithHeaderMapper.class)
    public void evenInArrayTest (int a1, int a2, int a3, int a4, int a5, int a6, int a7, int expRes) {
        int[] array = new int[7];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        array[3] = a4;
        array[4] = a5;
        array[5] = a6;
        array[6] = a7;
        Assert.assertEquals(expRes, loopsArrays.evenInArray(array));
    }

    @Test
    @FileParameters(value = "src/test/resources/LoopsArraysMin.csv", mapper = CsvWithHeaderMapper.class)
    public void arrayMinTest (int a1, int a2, int a3, int a4, int a5, int a6, int a7, int expRes) {
        int[] array = new int[7];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        array[3] = a4;
        array[4] = a5;
        array[5] = a6;
        array[6] = a7;
        Assert.assertEquals(expRes, loopsArrays.arrayMin(array));
    }

    @Test
    @FileParameters(value = "src/test/resources/LoopsArraysMax.csv", mapper = CsvWithHeaderMapper.class)
    public void arrayMaxTest (int a1, int a2, int a3, int a4, int a5, int a6, int a7, int expRes) {
        int[] array = new int[7];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        array[3] = a4;
        array[4] = a5;
        array[5] = a6;
        array[6] = a7;
        Assert.assertEquals(expRes, loopsArrays.arrayMax(array));
    }
    @Test
    @FileParameters(value = "src/test/resources/LoopsArraysIndexOf.csv", mapper = CsvWithHeaderMapper.class)
    public void arrayIndexOfTest (int a1, int a2, int a3, int a4, int a5, int a6, int a7, int number, int expRes) {
        int[] array = new int[7];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        array[3] = a4;
        array[4] = a5;
        array[5] = a6;
        array[6] = a7;
        Assert.assertEquals(expRes, loopsArrays.arrayIndexOf(array, number));
    }

    @Test
    @FileParameters(value = "src/test/resources/LoopsArraysMax2DimArray.csv", mapper = CsvWithHeaderMapper.class)
    public void arrayMax2DimTest (int a00, int a01, int a10, int a11, int a20, int a21, int expRes) {
        int[][] array = new int[3][2];
        array[0][0] = a00;
        array[0][1] = a01;
        array[1][0] = a10;
        array[1][1] = a11;
        array[2][0] = a20;
        array[2][1] = a21;
        Assert.assertEquals(expRes, loopsArrays.arrayMax2Dim(array));
    }
}
