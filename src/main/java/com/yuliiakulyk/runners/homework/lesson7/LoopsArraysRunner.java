package com.yuliiakulyk.runners.homework.lesson7;

import java.util.Scanner;

import static com.yuliiakulyk.runners.utils.Printers.*;
import static java.lang.System.out;

import com.yuliiakulyk.app.homework.lesson7.LoopsArrays;
import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;

/**
 * Created by Yuliia Kulyk on 22.10.2016.
 */
public class  LoopsArraysRunner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        LoopsArrays loopsArrays = new LoopsArrays();
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        boolean doAgain = true;
        do {
            out.println("Enter number of a problem to solve:");
            out.println("1 - print array of even numbers from 2 to 20 in a string and a column.");
            out.println("2 - print array of odd numbers from 1 to 99 in forward and reverse order.");
            out.println("3 - print array of 15 numbers from 0 to 9, number of its even elements.");
            out.println("4 - print array of 15 numbers from 0 to 999, its min and max elements.");
            out.println("5 - print 2-dimensional array [8][5] of random numbers from 10 to 99.");
            out.println("6 - print 2-dimensional array [8][5] of random numbers from 1 to 999 right-aligned.");
            out.println("7 - add int numbers.");
            out.println("8 - exit.");
            int problemNumber = scanner.nextInt();
            switch (problemNumber) {
                case 1: int min = 2;
                    int max = 20;
                    int[] array = loopsArrays.getEvenOddArrayFromTo(min, max, true);
                    printArrayOneLine(array);
                    printArraySeparateLines(array);
                    break;
                case 2: min = 1;
                    max = 99;
                    array = loopsArrays.getEvenOddArrayFromTo(min, max, false);
                    printArrayOneLine(array);
                    printArrayOneLineReverse(array);
                    break;
                case 3: int elements = 15;
                    min = 0;
                    max = 9;
                    array = randomArrayGenerators.random1DimensionArray(elements, min, max);
                    printArrayOneLine(array);
                    out.println("Number of even values is " + loopsArrays.evenInArray(array) + ".");
                    break;
                case 4: elements = 15;
                    min = 0;
                    max = 999;
                    array = randomArrayGenerators.random1DimensionArray(elements, min, max);
                    printArrayOneLine(array);
                    out.println("min = " + loopsArrays.arrayMin(array) + ", max = " + loopsArrays.arrayMax(array) + ".");
                    break;
                case 5: int elements1 = 8;
                    int elements2 = 5;
                    min = 10;
                    max = 99;
                    int [][] array2Dim = randomArrayGenerators.random2DimensionArray(elements1, elements2, min, max);
                    print2DimArray(array2Dim);
                    break;
                case 6: elements1 = 8;
                    elements2 = 5;
                    min = 1;
                    max = 999;
                    array2Dim = randomArrayGenerators.random2DimensionArray(elements1, elements2, min, max);
                    print2DimArrayRightAligned(array2Dim);
                    break;
                case 7: int sum = 0;
                    String input = "";
                    out.println("Type 'exit' to stop entering numbers to add.");
                    while (input != "exit") {
                        out.println("Enter a number to add: ");
                        input = scanner.next();
                        if (input.equals("exit")) {
                            break;
                        }
                        sum += Integer.parseInt(input);
                    }
                    out.println("Sum = " + sum);
                    break;
                case 8: doAgain = false;
                    break;
                default: out.println("There is no such an option. Please, try again");
            }

        } while (doAgain);
    }
}
