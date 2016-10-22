package com.yuliiakulyk.runners.classwork.lesson7;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by 123 on 22.10.2016.
 */
public class CounterDecreaseRunner {
    public static void main (String args[]) {
        out.println("Enter a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        out.println("Enter b:");
        int b = scanner.nextInt();
        while (a > b) {
            out.println("a = " + a + ", b = " + b);
            a--;
        }
        out.println("a = " + a + ", b = " + b);
    }
}
