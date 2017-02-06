package com.yuliiakulyk.runners.arrays_and_sorting;

import com.yuliiakulyk.app.arrays_and_sorting.LoopsArrays;
import com.yuliiakulyk.app.arrays_and_sorting.RandomArrayGenerators;
import com.yuliiakulyk.app.arrays_and_sorting.ArraySortAscDesc;
import com.yuliiakulyk.runners.convertors_and_files.runners.EnumHometask;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;
import static com.yuliiakulyk.runners.utils.Printers.print2DimArrayRightAligned;
import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 28.11.2016.
 */
public class ArraySortingRunnerWithEnum {
    public static void main(String[] args) {
        boolean doAgain = true;
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        ArraySortAscDesc arraySortAscDesc = new ArraySortAscDesc();
        LoopsArrays loopsArrays = new LoopsArrays();
        EnumHometask task;
        do {
            out.println("Enter number of a problem to solve:");
            out.println("A - apply ascending bubble sorting to an array.");
            out.println("B - apply descending bubble sorting to an array.");
            out.println("C - apply ascending selection sorting to an array.");
            out.println("D - apply descending selection sorting to an array.");
            out.println("E - create array [5][8] of numbers [-99;99], get its maximum number.");
            out.println("F - get 15 cases from multiplication table.");
            out.println("G - exit.");
            try {
                task = EnumHometask.valueOf(getKeyboardInput().toUpperCase());
                switch (task) {
                    case A:
                        int[] array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                        out.print("Initial array:    ");
                        printArrayOneLine(array);
                        int[] arrayAscBubble = arraySortAscDesc.sortArrayAscBubble(array);
                        out.print("Ascending bubble: ");
                        printArrayOneLine(arrayAscBubble);
                        break;
                    case B:
                        array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                        out.print("Initial array:     ");
                        printArrayOneLine(array);
                        int[] arrayDescBubble = arraySortAscDesc.sortArrayDescBubble(array);
                        out.print("Descending bubble: ");
                        printArrayOneLine(arrayDescBubble);
                        break;
                    case C:
                        array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                        out.print("Initial array:       ");
                        printArrayOneLine(array);
                        int[] arrayAscSelection = arraySortAscDesc.sortArrayAscSelection(array);
                        out.print("Ascending selection: ");
                        printArrayOneLine(arrayAscSelection);
                        break;
                    case D:
                        array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                        out.print("Initial array:        ");
                        printArrayOneLine(array);
                        int[] arrayDescSelection = arraySortAscDesc.sortArrayDescSelection(array);
                        out.print("Descending selection: ");
                        printArrayOneLine(arrayDescSelection);
                        break;
                    case E:
                        int[][] array2Dim = randomArrayGenerators.random2DimensionArray(5, 8, -99, 99);
                        print2DimArrayRightAligned(array2Dim);
                        out.println("Array maximum is " + loopsArrays.arrayMax2Dim(array2Dim));
                        break;
                    case F:
                        int[][] cases;
                        cases = randomArrayGenerators.randomCasesMultiplicationTable(15);
                        for (int i = 0; i < cases.length; i++) {
                            out.println(cases[i][0] + " * " + cases[i][1] + " = " + cases[i][0] * cases[i][1]);
                        }
                        break;
                    case G:
                        doAgain = false;
                        break;
                    default:
                        System.out.println("There is no such an option. Please, try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("There is no such an option. Please, try again.");
            }
        } while (doAgain);
    }
}