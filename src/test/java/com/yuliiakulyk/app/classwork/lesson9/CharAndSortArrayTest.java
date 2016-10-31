package com.yuliiakulyk.app.classwork.lesson9;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 31.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CharAndSortArrayTest {
    CharArray charArray;
    SortArray sortArray;
    RandomArrayGenerators randomArrayGenerators;

    @Before
    public void prepare() {
        charArray = new CharArray();
        sortArray = new SortArray();
        randomArrayGenerators = new RandomArrayGenerators();
    }

    @Test
    @FileParameters(value = "src/test/resources/CharArray.csv", mapper = CsvWithHeaderMapper.class)
    public void charArrayTest(int unicode, char symbol) {
        char[] array = charArray.getArrayChar(256);
        Assert.assertEquals(array[unicode], symbol);
    }

    @Test
    public void sortArrayTest() {
        int[] array = randomArrayGenerators.random1DimensionArray(100, -5, 40);
        int[] testArray = sortArray.sortArrayBubble(array);
        Arrays.sort(array);
        boolean isEqual = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != testArray[i]) {
                isEqual = false;
            }
        }
        Assert.assertEquals(true, isEqual);
    }

}
