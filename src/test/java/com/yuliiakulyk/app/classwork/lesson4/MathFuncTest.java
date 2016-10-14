package com.yuliiakulyk.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Юлия on 12.10.2016.
 */
public class MathFuncTest {
    @Test //JUnit framework annotation
    public void multiplyTest(){
        int a = 1, b = 2, expRes = 2;
        MathFunc mathFuncObject = new MathFunc ();
        Assert.assertEquals(expRes, mathFuncObject.multiply(a,b));
    } //close method
} //close class
