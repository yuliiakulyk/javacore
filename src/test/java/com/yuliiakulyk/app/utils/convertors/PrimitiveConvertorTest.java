package com.yuliiakulyk.app.utils.convertors;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 123 on 19.10.2016.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToCharTest() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        float float1 = 65.5f;
        char expRes = 'A';
        Assert.assertEquals(expRes, convertor.floatToChar(float1));
    }

    @Test
    public void intToCharTest() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        int int1 = 65;
        char expRes = 'A';
        Assert.assertEquals(expRes, convertor.intToChar(int1));
    }

    @Test
    public void charToIntTest() {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        char char1 = 'A';
        int expRes = 65;
        Assert.assertEquals(expRes, convertor.charToInt(char1));
    }
}
