package com.yuliiakulyk.app.homework.lesson6;

import com.yuliiakulyk.app.homework.lesson4.BiologyCalc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by DELL on 20.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class BiologyCalcDataDrivenTest {

    @Before
    public void preConditionsForClass() throws IOException {
        BiologyCalc biologyCalc = new BiologyCalc();
    } // не работает, если в тестовых методах убрать создание объекта класса BiologyCalc, ошибка

    @Test
    @FileParameters(value = "src/test/resources/BiologyCalcIdealWeight.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getIdealWeightTest (int height, String gender, double expOut) {
        BiologyCalc biologyCalc = new BiologyCalc();
        Assert.assertEquals(expOut, biologyCalc.getIdealWeight(height, gender), 0.001);
    }
    @Test
    @FileParameters(value = "src/test/resources/BiologyCalcWaterNorm.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getWaterNormTest (String gender, double weight, double expOut) {
        BiologyCalc biologyCalc = new BiologyCalc();
        Assert.assertEquals(expOut, biologyCalc.getWaterNorm(gender, weight), 0.01);
    }

}
