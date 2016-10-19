package com.yuliiakulyk.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by 123 on 15.10.2016.
 */
public class MathProblemsTest {
    @Test
    public void getInterestSumTest () {
        double intRate = 5.3;
        double sumOnAccount = 1000.00;
        double expRes = 53;
        double delta = 0.001;
        MathProblems MathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, MathProblemsObject.getInterestSum(intRate, sumOnAccount), delta);
    }
    @Test
    public void compositeToSimpleInterestTest () {
        double expRes = 34.489;
        double compositeMonthlyInterest = 2.5;
        double delta = 0.001;
        MathProblems MathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, MathProblemsObject.compositeToSimpleInterest(compositeMonthlyInterest), delta);
    }
    @Test
    public void multiplyNumbersTest () {
        ArrayList<Integer> numbersToMultiply = new ArrayList<Integer>(Arrays.asList(12, 13, 14));
        int expRes = 2184;
        MathProblems MathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, MathProblemsObject.multiplyNumbers(numbersToMultiply));
    }
    @Test
    public void addNumbersTest () {
        ArrayList<Integer> numbersToMultiply = new ArrayList<Integer>(Arrays.asList(12, 13, 14, 15, 16));
        int expRes = 70;
        MathProblems MathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, MathProblemsObject.addNumbers(numbersToMultiply));
    }
    @Test
    public void sumNProgressionElementsTest () {
        int base = 10;
        int step = 5;
        int elementsForSum = 4;
        int expRes = 70;
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.sumNProgressionElements(base, step, elementsForSum));
    }
    @Test
    public void isEvenTest() {
        int number = 8;
        boolean expRes = true;
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.isEven(number));
    }
    @Test
    public void areDividedByEachOtherTest () {
        int number1 = 4;
        int number2 = 28;
        boolean expRes = true;
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.areDividedByEachOther(number1, number2));
    }
    @Test
    public void areDividedByEachOtherTest2 () {
        int number1 = 24;
        int number2 = 8;
        boolean expRes = true;
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.areDividedByEachOther(number1, number2));
    }
    @Test
    public void getTravelTimeTest () {
        double distance = 750;
        double speed = 100;
        double expRes = 7.5;
        double delta = 0.000001;
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.getTravelTime (distance, speed), delta);
    }
    @Test
    public void getQuadraticEquationRootTest () {
        int a = 4;
        int b = -20;
        int c = 25;
        String expRes = "2.5";
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.getQuadraticEquationRoot(a, b, c));

    }
    @Test
    public void numberBinaryNotationTest () {
        int number = 26;
        String expRes = "11010";
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.numberBinaryNotation(number));
    }
    @Test
    public void number16NotationTest () {
        int number = 244677;
        String expRes = "3bbc5";
        MathProblems mathProblemsObject = new MathProblems();
        Assert.assertEquals(expRes, mathProblemsObject.number16Notation(number));
    }

}
