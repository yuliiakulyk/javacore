package com.yuliiakulyk.app.ForUnitTesting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 123 on 15.10.2016.
 */
public class TextTransformationTest {
    @Test
    public void lowerToUpperCaseTest() {
        String inputString = "Yuliia";
        String expRes = "YULIIA";
        TextTransformation textTransformationObject = new TextTransformation();
        Assert.assertEquals(expRes, textTransformationObject.lowerToUpperCase(inputString));
    }

    @Test
    public void getFirstSymbolTest() {
        String inputString = "yuliia";
        char expRes = 'y';
        TextTransformation textTransformationObject = new TextTransformation();
        Assert.assertEquals(expRes, textTransformationObject.getFirstSymbol(inputString));
    }

    @Test
    public void removeBracketsAndDashesTest() {
        String inputString = "((068)-123--12-12)";
        String expRes = "0681231212";
        TextTransformation textTransformationObject = new TextTransformation();
        Assert.assertEquals(expRes, textTransformationObject.removeBracketsAndDashes(inputString));
    }

    @Test
    public void getNextLetterInAplpabetTest() {
        char inputchar = 'm';
        char expRes = 'n';
        TextTransformation textTransformationObject = new TextTransformation();
        Assert.assertEquals(expRes, textTransformationObject.getNextLetterInAplpabet(inputchar));
    }

    @Test
    public void getSymbolUnicode() {
        char inputChar = 'm';
        int expRes = 109;
        TextTransformation textTransformationObject = new TextTransformation();
        Assert.assertEquals(expRes, textTransformationObject.getSymbolUnicode(inputChar));
    }
}
