package com.yuliiakulyk.app.UseStringBuilder;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Yuliia Kulyk on 25.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class EnigmaTest {
    Enigma enigma;

    @Before
    public void precondition() {
        enigma = new Enigma();
    }

    @Test
    @FileParameters(value = "src/test/resources/EnigmaTest.csv", mapper = CsvWithHeaderMapper.class)
    public void encodeTest(String input, String expResEncoded) {
        Assert.assertEquals(expResEncoded, enigma.encode(input));
    }

    @Test
    @FileParameters(value = "src/test/resources/EnigmaTest.csv", mapper = CsvWithHeaderMapper.class)
    public void decodeTest(String expResDecoded, String inputEncoded) {
        Assert.assertEquals(expResDecoded, enigma.decode(inputEncoded));
    }

}
