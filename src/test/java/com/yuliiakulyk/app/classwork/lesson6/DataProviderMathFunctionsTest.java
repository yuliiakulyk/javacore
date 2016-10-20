package com.yuliiakulyk.app.classwork.lesson6;

import com.yuliiakulyk.app.classwork.lesson4.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by DELL on 20.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
    } //make sure that variables are in same order and types as in csv file
}
