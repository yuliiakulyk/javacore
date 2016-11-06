package com.yuliiakulyk.app.utils.convertors;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Yuliia Kulyk on 06.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CharsToStringTest {
    CharsToString charsToString;
    @Before
    public void prep() {
        charsToString = new CharsToString();
    }

    @Test
    @FileParameters(value = "src/test/resources/charsToString.csv", mapper = CsvWithHeaderMapper.class)
    public void charsToStringTest(char c1, char c2, char c3, char c4, char c5, char c6, String string) {
        char[] charArray = {c1, c2, c3, c4, c5, c6};
        Assert.assertEquals(string, charsToString.charArrayToString(charArray));
    }

}
