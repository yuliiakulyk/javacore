package com.yuliiakulyk.app.utils.convertors;

import com.yuliiakulyk.runners.convertors_and_files.classes.PrimitiveToString;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Yuliia Kulyk on 07.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class PrimitiveToStringTest {
    PrimitiveToString primitiveToString;

    @Before
    public void prep() {
        primitiveToString = new PrimitiveToString();
    }

    @Test
    public void intToStringTest() {
        Assert.assertEquals("3456789", primitiveToString.intToString(3456789));
    }

    @Test
    public void doubleToStringTest() {
        Assert.assertEquals("345.6789", primitiveToString.doubleToString(345.6789d));
    }

    @Test
    public void floatToStringTest() {
        Assert.assertEquals("345.6789", primitiveToString.floatToString(345.6789f));
    }

    @Test
    public void longToStringTest() {
        Assert.assertEquals("345678910", primitiveToString.longToString(345678910L));
    }

    @Test
    public void booleanToStringTest() {
        Assert.assertEquals("false", primitiveToString.booleanToString(false));
    }

    @Test
    public void intFromStringTest() {
        Assert.assertEquals(23456789, primitiveToString.intFromString("023456789"));
    }

    @Test
    public void doubleFromStringTest() {
        Assert.assertEquals(2345.6789d, primitiveToString.doubleFromString("2345.6789"), 0.0001);
    }

    @Test
    public void floatFromStringTest() {
        Assert.assertEquals(2345.6789f, primitiveToString.floatFromString("2345.6789"), 0.0001);
    }

    @Test
    public void longFromStringTest() {
        Assert.assertEquals(23456789L, primitiveToString.longFromString("23456789"));
    }

    @Test
    public void booleanFromStringTest() {
        Assert.assertEquals(true, primitiveToString.booleanFromString("true"));
    }

    @Test
    public void booleanFromStringTest2() {
        Assert.assertEquals(true, primitiveToString.booleanFromString("TRUE"));
    }

}
