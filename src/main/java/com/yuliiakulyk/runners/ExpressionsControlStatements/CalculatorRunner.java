package com.yuliiakulyk.runners.ExpressionsControlStatements;

import java.util.Scanner;

import com.yuliiakulyk.app.ExpressionsControlStatements.Calculator;
import com.yuliiakulyk.runners.ConvertorsAndFiles.runners.EnumHometask;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;
import static java.lang.System.out;


/**
 * Created by 123 on 15.10.2016.
 */
public class CalculatorRunner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean doAgain = true;
        EnumHometask task;
        do {
            out.println("Enter number of a problem to solve:");
            out.println("A - are a,b,c sides of a right-angled triangle?");
            out.println("B - calculate area of a circle with r radius");
            out.println("C - find out if a number is even or odd");
            out.println("D - find out which circle area is bigger");
            out.println("E - exit the program");
            try {
                task = EnumHometask.valueOf(getKeyboardInput().toUpperCase());
                switch (task) {
                    case A:
                        out.println("Enter length of 'a' side:");
                        double a = scanner.nextDouble();
                        out.println("Enter length of 'b' side:");
                        double b = scanner.nextDouble();
                        out.println("Enter length of 'c' side:");
                        double c = scanner.nextDouble();
                        if (Calculator.rightAngledTriangleCheck(a, b, c)) {
                            out.println("a, b, c are sides of a right-angled triangle.");
                        } else {
                            out.println("a, b, c are not sides of a right-angled triangle.");
                        }
                        break;
                    case B:
                        out.println("Enter a circle radius:");
                        double r = scanner.nextDouble();
                        out.println("Circle area = " + Calculator.calculateCircleArea(r));
                        break;
                    case C:
                        out.println("Enter a number:");
                        int number = scanner.nextInt();
                        if (Calculator.isOdd(number)) {
                            out.println(number + " is odd.");
                        } else {
                            out.println(number + " is even.");
                        }
                        break;
                    case D:
                        out.println("Enter area1:");
                        double area1 = scanner.nextDouble();
                        System.out.println("Enter area2:");
                        double area2 = scanner.nextDouble();
                        Calculator.calculateBigger(area1, area2);
                        break;
                    case E:
                        doAgain = false;
                        out.println("Program is closed. Bye!");
                        break;
                    default:
                        System.out.println("There is no such a task. Try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("There is no such a task. Try again.");
            }
        } while (doAgain);
    } // close method main
} // close class
