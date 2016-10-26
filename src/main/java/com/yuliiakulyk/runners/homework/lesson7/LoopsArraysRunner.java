package com.yuliiakulyk.runners.homework.lesson7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by 123 on 22.10.2016.
 */
public class LoopsArraysRunner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean doAgain = true;
        do {
            out.println("Enter number of a problem to solve:");
            out.println("1 - print array of even numbers from 2 to 20 in a string and a column.");
            out.println("2 - print array of odd numbers from 1 to 99 in forward and reverse order.");
            out.println("3 - print array of 15  numbers from 0 to 9, number of its even elements.");
            out.println("4 - print array of 15  numbers from 0 to 999, its min and max elements.");
            out.println("5 - print 2-dimensional array [8][5] of random numbers from 10 to 99.");
            out.println("6 - print 2-dimensional array [8][5] of random numbers from 1 to 999 right-aligned.");
            out.println("7 - add int numbers.");
            out.println("8 - exit.");
            int problemNumber = scanner.nextInt();
            if (problemNumber == 1) {
                getEven();
            } else if (problemNumber == 2) {
                getOdd();
            } else if (problemNumber == 3) {
                randomEvenQuantity();
            } else if (problemNumber == 4) {
                randomMinMax();
            } else if (problemNumber == 5) {
                populate2DimensionalArray();
            } else if (problemNumber == 6) {
                printArrayRightAlignment();
            } else if (problemNumber == 7) {
                add();
            } else if (problemNumber == 8) {
                doAgain = false;
            } else {
                out.println("There is no such an option. Please, try again");
            }

        } while (doAgain);
    }

    public static int[] getEven() {
        int[] array = new int[10];
        for (int i = 1; i <= 10; i++) {
            array[i - 1] = 2 * i;
        }
        printArrayOneLine(array);
        printArraySeparateLines(array);
        return array;
    }

    public static int[] getOdd() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        printArrayOneLine(array);
        printArrayOneLineReverse(array);
        return array;
    }

    public static int[] randomEvenQuantity() {
        int[] array = randomNumbers(15, 0, 9);
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        printArrayOneLine(array);
        out.println("Number of even values is " + even + ".");
        return array;
    }

    public static int[] randomMinMax() {
        int[] array = randomNumbers(15, 0, 999);
        printArrayOneLine(array);
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        out.println("min = " + min + ", max = " + max + ".");
        return array;
    }

    public static int[][] populate2DimensionalArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers(array[i].length, 10, 99);
            printArrayOneLine(array[i]);
        }
        return array;
    }

    public static int[][] printArrayRightAlignment() {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers(array[i].length, 1, 999);
            printArrayFormatted(array[i]);
        }
        return array;
    }

    public static void printArrayFormatted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.printf("%5d", array[i]);
        }
        out.println();
    }

    public static int add() {
        int sum = 0;
        String input = "";
        Scanner scanner = new Scanner(System.in);
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
        return sum;
    }

    public static int[] randomNumbers(int elements, int min, int max) {
        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max - min + 1));
        }
        return array;
    }

    public static void printArraySeparateLines(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.println(array[i]);
        }
    }

    public static void printArrayOneLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.print(array[i] + " ");
        }
        out.println();
    }

    public static void printArrayOneLineReverse(int[] array) {
        for (int i = array.length; i > 0; i--) {
            out.print(array[i - 1] + " ");
        }
        out.println();
    }
}
