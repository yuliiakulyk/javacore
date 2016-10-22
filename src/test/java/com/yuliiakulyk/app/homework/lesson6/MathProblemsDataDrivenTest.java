package com.yuliiakulyk.app.homework.lesson6;

import com.yuliiakulyk.app.homework.lesson4.MathProblems;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by DELL on 20.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class MathProblemsDataDrivenTest {
    MathProblems mathProblems;
    @Before
    public void createObject () {
        mathProblems = new MathProblems();
    }
    @Test
    @FileParameters(value = "src/test/resources/MathProblemsInterest.csv", mapper = CsvWithHeaderMapper.class)
    public void getInterestSumTest (double intRate, double sumOnAccount, double expRes) {
        //MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.getInterestSum(intRate, sumOnAccount), 0.01);
    }
    @Test
    @FileParameters(value = "src/test/resources/MathProblemsSimpleInterest.csv", mapper = CsvWithHeaderMapper.class)
    public void compositeToSimpleInterestTest (double compositeMonthlyInterest, double expRes) {
        //MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.compositeToSimpleInterest(compositeMonthlyInterest), 0.001);
    }
    /* @Test
    @FileParameters(value = "src/test/resources/MathProblemsMultiply.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyNumbersTest (ArrayList<Integer> numbers, int expRes) {
        MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.multiplyNumbers(numbers));
    } */
    @Test
    @FileParameters(value = "src/test/resources/MathProblemsSumProgression.csv", mapper = CsvWithHeaderMapper.class)
    public void sumNProgressionElementsTest (int firstElement, int step, int numberOfElements, int expRes) {
        //MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.sumNProgressionElements(firstElement, step, numberOfElements));
    }
    @Test
    @FileParameters(value = "src/test/resources/MathProblemsEven.csv", mapper = CsvWithHeaderMapper.class)
    public void isEvenTest (int number, boolean expRes) {
        //MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.isEven(number));
    }
    @Test
    @FileParameters(value = "src/test/resources/MathProblemsAreDivided.csv", mapper = CsvWithHeaderMapper.class)
    public void areDividedByEachOtherTest (int number1, int number2, boolean expRes) {
        //MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.areDividedByEachOther(number1, number2));
    }
    @Test
    @FileParameters(value = "src/test/resources/MathProblemsTravelTime.csv", mapper = CsvWithHeaderMapper.class)
    public void getTravelTimeTest (double distance, double speed, double expRes) {
        //MathProblems mathProblems = new MathProblems();
        Assert.assertEquals(expRes, mathProblems.getTravelTime(distance, speed), 0.001);
    }
}

