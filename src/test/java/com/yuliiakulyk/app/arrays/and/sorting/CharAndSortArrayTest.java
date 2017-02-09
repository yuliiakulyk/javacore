package com.yuliiakulyk.app.arrays.and.sorting;

import com.yuliiakulyk.app.arrays.and.sorting.ArraySortAscDesc;
import com.yuliiakulyk.app.arrays.and.sorting.CharArray;
import com.yuliiakulyk.app.arrays.and.sorting.RandomArrayGenerators;
import com.yuliiakulyk.app.arrays.and.sorting.SortArray;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;

/**
 * Created by Yuliia Kulyk on 31.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CharAndSortArrayTest {
    CharArray charArray;
    SortArray sortArray;
    RandomArrayGenerators randomArrayGenerators;
    ArraySortAscDesc arraySortAscDesc;

    @Before
    public void prepare() {
        charArray = new CharArray();
        sortArray = new SortArray();
        randomArrayGenerators = new RandomArrayGenerators();
        arraySortAscDesc = new ArraySortAscDesc();
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

    @Test
    public void sortArrayAscBubbleTest() {
        int[] array = randomArrayGenerators.random1DimensionArray(100, -5, 40);
        printArrayOneLine(array);
        int[] testArray = arraySortAscDesc.sortArrayAscBubble(array);
        Arrays.sort(array);
        boolean isEqual = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != testArray[i]) {
                isEqual = false;
            }
        }
        printArrayOneLine(testArray);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void sortArrayDescBubbleTest() {
        int[] array = randomArrayGenerators.random1DimensionArray(100, -5, 40);
        printArrayOneLine(array);
        int[] arrayInput = new int[array.length];
        System.arraycopy(array, 0, arrayInput, 0, array.length);
        int[] testArray = arraySortAscDesc.sortArrayDescBubble(arrayInput);
        printArrayOneLine(testArray);
        Arrays.sort(array);
        int[] array1 = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array1[i] = array[j];
        }
        printArrayOneLine(array1);
        boolean isEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != testArray[i]) {
                isEqual = false;
            }
        }
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void sortArrayAscSelectionTest() {
        int[] array = randomArrayGenerators.random1DimensionArray(100, -5, 40);
        int[] testArray = arraySortAscDesc.sortArrayAscSelection(array);
        Arrays.sort(array);
        boolean isEqual = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != testArray[i]) {
                isEqual = false;
            }
        }
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void sortArrayDescSelectionTest() {
        int[] array = randomArrayGenerators.random1DimensionArray(100, -5, 40);
        int[] testArray = arraySortAscDesc.sortArrayDescSelection(array);
        Arrays.sort(array);
        int[] arrayDesc = new int[array.length];
        for (int i = 0, j = arrayDesc.length - 1; i < arrayDesc.length; i++, j--) {
            arrayDesc[i] = array[j];
        }
        boolean isEqual = true;
        for (int i = 0; i < arrayDesc.length; i++) {
            if (arrayDesc[i] != testArray[i]) {
                isEqual = false;
            }
        }
        Assert.assertEquals(true, isEqual);
    }

}
