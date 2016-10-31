package com.yuliiakulyk.runners.homework.lesson9;

import com.yuliiakulyk.app.homework.lesson7.LoopsArrays;
import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;
import com.yuliiakulyk.app.homework.lesson9.ArraySortAscDesc;

import java.util.Scanner;

import static com.yuliiakulyk.runners.utils.Printers.print2DimArrayRightAligned;
import static com.yuliiakulyk.runners.utils.Printers.printArrayOneLine;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class ArraySortAscDescRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doAgain = true;
        RandomArrayGenerators randomArrayGenerators = new RandomArrayGenerators();
        ArraySortAscDesc arraySortAscDesc = new ArraySortAscDesc();
        LoopsArrays loopsArrays = new LoopsArrays();
        do {
            out.println("Enter number of a problem to solve:");
            out.println("1 - apply ascending bubble sorting to an array.");
            out.println("2 - apply descending bubble sorting to an array.");
            out.println("3 - apply ascending selection sorting to an array.");
            out.println("4 - apply descending selection sorting to an array.");
            out.println("5 - create array [5][8] of numbers [-99;99], get its maximum number.");
            out.println("6 - get 15 cases from multiplication table.");
            out.println("0 - exit.");
            String problemNumber = scanner.next();
            switch (problemNumber) {
                case "1":
                    int[] array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                    out.print("Initial array:    ");
                    printArrayOneLine(array);
                    int[] arrayAscBubble = arraySortAscDesc.sortArrayAscBubble(array);
                    out.print("Ascending bubble: ");
                    printArrayOneLine(arrayAscBubble);
                    break;
                case "2":
                    array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                    out.print("Initial array:     ");
                    printArrayOneLine(array);
                    int[] arrayDescBubble = arraySortAscDesc.sortArrayDescBubble(array);
                    out.print("Descending bubble: ");
                    printArrayOneLine(arrayDescBubble);
                    break;
                case "3":
                    array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                    out.print("Initial array:       ");
                    printArrayOneLine(array);
                    int[] arrayAscSelection = arraySortAscDesc.sortArrayAscSelection(array);
                    out.print("Ascending selection: ");
                    printArrayOneLine(arrayAscSelection);
                    break;
                case "4":
                    array = randomArrayGenerators.random1DimensionArray(20, -100, 300);
                    out.print("Initial array:        ");
                    printArrayOneLine(array);
                    int[] arrayDescSelection = arraySortAscDesc.sortArrayDescSelection(array);
                    out.print("Descending selection: ");
                    printArrayOneLine(arrayDescSelection);
                    break;
                case "5": int[][] array2Dim = randomArrayGenerators.random2DimensionArray(8, 5, -99, 99);
                    print2DimArrayRightAligned(array2Dim);
                    out.println("Array maximum is " + loopsArrays.arrayMax2Dim(array2Dim));
                    break;
                case "6": int[][] cases;
                    cases = randomArrayGenerators.randomCasesMultiplicationTable(15);
                    for (int i = 0; i < cases.length; i++) {
                        out.println(cases[i][0] + " * " + cases[i][1] + " = " + cases[i][0]*cases[i][1]);
                    }
                    break;
                case "0":
                    doAgain = false;
                    break;
                default:
                    out.println("There is no such an option. Please, try again");
            }
        } while (doAgain);
    }
}