package com.yuliiakulyk.app.unit.testing;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 123 on 15.10.2016.
 */
public class BiologyCalcTest {
    @Test
    public void getIdealWeightTest() {
        int height = 160;
        String gender = "female";
        double expRes = 57.5;
        double delta = 0.0001;
        BiologyCalc biologyCalcObject = new BiologyCalc();
        Assert.assertEquals(expRes, biologyCalcObject.getIdealWeight(height, gender), delta);
    }

    @Test
    public void getIdealWeightTest2() {
        int height = 160;
        String gender = "male";
        double expRes = 69;
        double delta = 0.0001;
        BiologyCalc biologyCalcObject = new BiologyCalc();
        Assert.assertEquals(expRes, biologyCalcObject.getIdealWeight(height, gender), delta);
    }

    @Test
    public void getWaterNormTest() {
        int weight = 51;
        String gender = "female";
        double expRes = 1.6;
        double delta = 0.0001;
        BiologyCalc biologyCalcObject = new BiologyCalc();
        Assert.assertEquals(expRes, biologyCalcObject.getWaterNorm(gender, weight), delta);
    }

    @Test
    public void getWaterNormTest2() {
        int weight = 51;
        String gender = "male";
        double expRes = 1.8;
        double delta = 0.0001;
        BiologyCalc biologyCalcObject = new BiologyCalc();
        Assert.assertEquals(expRes, biologyCalcObject.getWaterNorm(gender, weight), delta);
    }
}
