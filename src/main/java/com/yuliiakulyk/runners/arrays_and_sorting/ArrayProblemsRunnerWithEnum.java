package com.yuliiakulyk.runners.arrays_and_sorting;

import com.yuliiakulyk.app.arrays_and_sorting.LoopsArrays;
import com.yuliiakulyk.app.arrays_and_sorting.RandomArrayGenerators;
import com.yuliiakulyk.runners.convertors_and_files.runners.EnumHometask;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;
import static com.yuliiakulyk.runners.utils.Printers.*;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 28.11.2016.
 */
public class ArrayProblemsRunnerWithEnum {
    public static void main(String[] args) {
        LoopsArrays loopsArrays = new LoopsArrays();
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        EnumHometask task;
        boolean doAgain = true;
        do {
            out.println("Enter number of a problem to solve:");
            out.println("A - print array of even numbers from 2 to 20 in a string and a column.");
            out.println("B - print array of odd numbers from 1 to 99 in forward and reverse order.");
            out.println("C - print array of 15 numbers from 0 to 9, number of its even elements.");
            out.println("D - print array of 15 numbers from 0 to 999, its min and max elements.");
            out.println("E - print 2-dimensional array [8][5] of random numbers from 10 to 99.");
            out.println("F - print 2-dimensional array [8][5] of random numbers from 1 to 999 right-aligned.");
            out.println("G - add int numbers.");
            out.println("H - exit.");
            try {
                task = EnumHometask.valueOf(getKeyboardInput().toUpperCase());
                switch (task) {
                    case A:
                        int min = 2;
                        int max = 20;
                        int[] array = loopsArrays.getEvenOddArrayFromTo(min, max, true);
                        printArrayOneLine(array);
                        printArraySeparateLines(array);
                        break;
                    case B:
                        min = 1;
                        max = 99;
                        array = loopsArrays.getEvenOddArrayFromTo(min, max, false);
                        printArrayOneLine(array);
                        printArrayOneLineReverse(array);
                        break;
                    case C:
                        int elements = 15;
                        min = 0;
                        max = 9;
                        array = randomArrayGenerators.random1DimensionArray(elements, min, max);
                        printArrayOneLine(array);
                        out.println("Number of even values is " + loopsArrays.evenInArray(array) + ".");
                        break;
                    case D:
                        elements = 15;
                        min = 0;
                        max = 999;
                        array = randomArrayGenerators.random1DimensionArray(elements, min, max);
                        printArrayOneLine(array);
                        out.println("min = " + loopsArrays.arrayMin(array) + ", max = " + loopsArrays.arrayMax(array) + ".");
                        break;
                    case E:
                        int elements1 = 8;
                        int elements2 = 5;
                        min = 10;
                        max = 99;
                        int[][] array2Dim = randomArrayGenerators.random2DimensionArray(elements1, elements2, min, max);
                        print2DimArray(array2Dim);
                        break;
                    case F:
                        elements1 = 8;
                        elements2 = 5;
                        min = 1;
                        max = 999;
                        array2Dim = randomArrayGenerators.random2DimensionArray(elements1, elements2, min, max);
                        print2DimArrayRightAligned(array2Dim);
                        break;
                    case G:
                        int sum = 0;
                        String input = "";
                        out.println("Type 'exit' to stop entering numbers to add.");
                        while (input != "exit") {
                            out.println("Enter a number to add: ");
                            input = getKeyboardInput();
                            if (input.equals("exit")) {
                                break;
                            }
                            sum += Integer.parseInt(input);
                        }
                        out.println("Sum = " + sum);
                        break;
                    case H:
                        doAgain = false;
                        break;
                    default:
                        System.out.println("There is no such a task. Please try again.");
                }


            } catch (IllegalArgumentException e) {
                System.out.println("There is no such a task. Please try again.");
            }
        } while (doAgain);
    }
}
