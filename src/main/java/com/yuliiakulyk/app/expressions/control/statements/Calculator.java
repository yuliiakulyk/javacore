package com.yuliiakulyk.app.expressions.control.statements;

/**
 * Created by 123 on 15.10.2016.
 */
public class Calculator {

    public static double calculateCircleArea(double radius) {
        // Scanner scanner = new Scanner (System.in);
        double circleArea = Math.pow(radius, 2) * Math.PI;
        return circleArea;
    }

    public static double calculateBigger(double area1, double area2) {
        double max;
        if (area1 > area2) {
            System.out.println("Area1 > area2");
            max = area1;
        } else if (area1 < area2) {
            System.out.println("Area2 > area1");
            max = area2;
        } else {
            System.out.println("Area1 = area2");
            max = area1;
        }
        return max;
    }

    public static boolean rightAngledTriangleCheck(double a, double b, double c) {
        boolean pifagorTrue = false;
        if ((c * c == a * a + b * b) || (a * a == b * b + c * c) || (b * b == a * a + b * b)) {
            pifagorTrue = true;
        }
        return pifagorTrue;
    }

    public static boolean isOdd(int number) {
        boolean odd;
        if ((number % 2) == 0) {
            odd = false;
        } else {
            odd = true;
        }
        return odd;
    }

}
