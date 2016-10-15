package com.yuliiakulyk.app.classwork.lesson5;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by 123 on 15.10.2016.
 */
public class Calculator {

    public static double calculateCircleArea (double radius) {
        Scanner scanner = new Scanner (System.in);
        double circleArea = Math.pow(radius, 2) * Math.PI;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }
    public static void calculateBigger() {
        double area1;
        double area2;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter area1:");
        area1 = scanner.nextDouble();
        System.out.println("Enter area2:");
        area2 = scanner.nextDouble();
        if (area1 > area2 ) {
            System.out.println("Area1 > area2");
        } else if (area1 < area2){
            System.out.println("Area2 > area1");
        } else {
            System.out.println("Area1 = area2");
        }
    }
    public static boolean rightAngledTriangleCheck (double a, double b, double c) {
        boolean pifagorTrue = false;
        if (c*c == a*a + b*b) {
            pifagorTrue = true;
        }
        return pifagorTrue;
    }
    /*
    public static void main () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        if (rightAngledTriangleCheck(a, b, c)) {
            System.out.println("a, b, c are sides of right-angled triangle" );
        } else {
            System.out.println("a, b, c are not sides of right-angled triangle");
        }
    }
    */
    public static boolean isOdd (int number) {
        boolean odd;
        if ((number % 2) == 0) {
            odd = true;
        } else {
            odd = false;
        }
        return odd;
    }

}
