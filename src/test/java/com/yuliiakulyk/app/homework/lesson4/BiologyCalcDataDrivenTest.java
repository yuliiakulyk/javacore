package com.yuliiakulyk.app.homework.lesson4;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by DELL on 20.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class BiologyCalcDataDrivenTest {
    /*@Before
    public void preConditionsForClass() {
        BiologyCalc biologyCalc = new BiologyCalc();
    } */
    @Test
    @FileParameters(value = "src/test/resources/biodata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd (int height, String gender, double expOut) {
        BiologyCalc biologyCalc = new BiologyCalc();
        Assert.assertEquals(expOut, biologyCalc.getIdealWeight(height, gender), 0.001);
    }

}
