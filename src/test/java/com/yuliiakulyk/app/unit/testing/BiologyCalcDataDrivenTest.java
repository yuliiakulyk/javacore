package com.yuliiakulyk.app.unit.testing;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by DELL on 20.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class BiologyCalcDataDrivenTest {
    BiologyCalc biologyCalc;

    @Before
    public void preConditionsForClass() throws IOException {
        biologyCalc = new BiologyCalc();
    }

    @Test
    @FileParameters(value = "src/test/resources/BiologyCalcIdealWeight.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getIdealWeightTest(int height, String gender, double expOut) {
        Assert.assertEquals(expOut, biologyCalc.getIdealWeight(height, gender), 0.001);
    }

    @Test
    @FileParameters(value = "src/test/resources/BiologyCalcWaterNorm.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getWaterNormTest(String gender, double weight, double expOut) {
        Assert.assertEquals(expOut, biologyCalc.getWaterNorm(gender, weight), 0.01);
    }

}
