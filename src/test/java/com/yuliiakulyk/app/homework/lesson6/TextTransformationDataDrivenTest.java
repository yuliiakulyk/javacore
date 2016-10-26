package com.yuliiakulyk.app.homework.lesson6;

import com.yuliiakulyk.app.homework.lesson4.TextTransformation;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by DELL on 20.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class TextTransformationDataDrivenTest {
    TextTransformation textTransformationObject;

    @Before
    public void createObject() {
        textTransformationObject = new TextTransformation();
    }

    @Test
    @FileParameters(value = "src/test/resources/TextTransformationToUpperCase.csv", mapper = CsvWithHeaderMapper.class)
    public void lowerToUpperCaseTest(String string, String expRes) {
        Assert.assertEquals(expRes, textTransformationObject.lowerToUpperCase(string));
    }

    @Test
    @FileParameters(value = "src/test/resources/TextTransformationRemove.csv", mapper = CsvWithHeaderMapper.class)
    public void removeBracketsAndDashesTest(String string, String expRes) {
        Assert.assertEquals(expRes, textTransformationObject.removeBracketsAndDashes(string));
    }
}
