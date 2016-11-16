package com.yuliiakulyk.app.classwork.lesson12;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CaesarTest {
    Caesar caesar;

    @Before
    public void precondition () {
        caesar = new Caesar();
    }

    @Test
    @FileParameters(value = "src/test/resources/encodeTest.csv", mapper = CsvWithHeaderMapper.class)
    public void encodeTest (String inputString, String expRes) {
        Assert.assertEquals(expRes, caesar.encode(inputString));
    }

    @Test
    @FileParameters(value = "src/test/resources/decodeTest.csv", mapper = CsvWithHeaderMapper.class)
    public void decodeTest (String inputString, String expRes) {
        Assert.assertEquals(expRes, caesar.decode(inputString));
    }

}
