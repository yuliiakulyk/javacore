package com.yuliiakulyk.app.expressions.control.statements;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 123 on 19.10.2016.
 */
public class CalculatorTest {
    @Test
    public void calculateCircleAreaTest() {
        Calculator calculator = new Calculator();
        double radius = 7.7;
        double expRes = 186.1706;
        double delta = 0.1;
        Assert.assertEquals(expRes, calculator.calculateCircleArea(radius), delta);
    }

    @Test
    public void calculateCircleAreaTest2() {
        Calculator calculator = new Calculator();
        double radius = 0;
        double expRes = 0;
        double delta = 0.1;
        Assert.assertEquals(expRes, calculator.calculateCircleArea(radius), delta);
    }

    @Test
    public void calculateBiggerTest() {
        Calculator calculator = new Calculator();
        double area1 = 7.7;
        double area2 = 9.9;
        double delta = 0.001;
        double expRes = 9.9;
        Assert.assertEquals(expRes, calculator.calculateBigger(area1, area2), delta);
    }

    @Test
    public void calculateBiggerTest2() {
        Calculator calculator = new Calculator();
        double area1 = 101.1;
        double area2 = 9.9;
        double delta = 0.001;
        double expRes = 101.1;
        Assert.assertEquals(expRes, calculator.calculateBigger(area1, area2), delta);
    }

    @Test
    public void calculateBiggerTest3() {
        Calculator calculator = new Calculator();
        double area1 = 101.1;
        double area2 = 101.1;
        double delta = 0.001;
        double expRes = 101.1;
        Assert.assertEquals(expRes, calculator.calculateBigger(area1, area2), delta);
    }

    @Test
    public void calculateBiggerTest4() {
        Calculator calculator = new Calculator();
        double area1 = 101.10;
        double area2 = 101.100;
        double delta = 0.001;
        double expRes = 101.1;
        Assert.assertEquals(expRes, calculator.calculateBigger(area1, area2), delta);
    }

    @Test
    public void rightAngledTriangleCheckTest() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 4;
        double c = 3;
        boolean expRes = true;
        Assert.assertEquals(expRes, calculator.rightAngledTriangleCheck(a, b, c));
    }

    @Test
    public void rightAngledTriangleCheckTest2() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 4;
        double c = 4;
        boolean expRes = false;
        Assert.assertEquals(expRes, calculator.rightAngledTriangleCheck(a, b, c));
    }

    @Test
    public void rightAngledTriangleCheckTest3() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 4;
        double c = 5;
        boolean expRes = true;
        Assert.assertEquals(expRes, calculator.rightAngledTriangleCheck(a, b, c));
    }

    @Test
    public void rightAngledTriangleCheckTest4() {
        Calculator calculator = new Calculator();
        double a = 4;
        double b = 3;
        double c = 5;
        boolean expRes = true;
        Assert.assertEquals(expRes, calculator.rightAngledTriangleCheck(a, b, c));
    }

    @Test
    public void isOddTest() {
        Calculator calculator = new Calculator();
        int number = 5;
        boolean expRes = true;
        Assert.assertEquals(expRes, calculator.isOdd(number));
    }

    @Test
    public void isOddTest2() {
        Calculator calculator = new Calculator();
        int number = 10;
        boolean expRes = false;
        Assert.assertEquals(expRes, calculator.isOdd(number));
    }

    @Test
    public void isOddTest3() {
        Calculator calculator = new Calculator();
        int number = 0;
        boolean expRes = false;
        Assert.assertEquals(expRes, calculator.isOdd(number));
    }
}
