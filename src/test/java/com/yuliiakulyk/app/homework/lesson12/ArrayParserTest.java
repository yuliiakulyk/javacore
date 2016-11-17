package com.yuliiakulyk.app.homework.lesson12;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class ArrayParserTest {
    RandomArrayGenerators randomArrayGenerators;
    ArrayParser arrayParser;

    @Before
    public void precondition () {
        randomArrayGenerators = new RandomArrayGenerators();
        arrayParser = new ArrayParser();
    }

    @Test
    public void stringToIntArrayTest () {
        int[] array = randomArrayGenerators.random1DimensionArray(100, -50, 50);
        String string = Arrays.toString(array);
        string = string.replace("[", "");
        string = string.replace("]", "");
        string = string.replace(", ", ",");
        Assert.assertArrayEquals(array, arrayParser.stringToIntArray(string, ","));
    }

    @Test
    public void stringToStringArrayTest () {
        String string = "Normally, Java properties file is used to store project configuration data or settings";
        String[] arrayString = {"Normally,","Java","properties","file","is","used","to","store","project","configuration","data","or","settings"};
        Assert.assertArrayEquals(arrayString, arrayParser.stringToStringArray(string, " "));
    }

    @Test
    public void alphabetFromStringArrayTest() {
        String[] string = {"abc", "12d3", "ef"};
        Assert.assertEquals("abcdef", arrayParser.alphabetFromStringArray(string));
    }

}
