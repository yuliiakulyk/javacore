package com.yuliiakulyk.runners.homework.lesson13;

import com.yuliiakulyk.app.utils.convertors.FileWork;
import com.yuliiakulyk.app.homework.lesson9.ArraySortAscDesc;
import com.yuliiakulyk.app.homework.lesson12.ArrayParser;

import static com.yuliiakulyk.runners.utils.KeyboardInput.*;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 13.11.2016.
 */
public class Hometask13 {
    public static void main(String[] args) {
        boolean doAgain = true;
        do {
            out.println("Please select number of a problem to solve:");
            out.println("1 - Read int arrays from a file, sort and write to another file.");
            out.println("0 - Exit.");
            switch (getKeyboardInput()) {
                case "1":
                    FileWork fileWork = new FileWork();
                    ArraySortAscDesc sort = new ArraySortAscDesc();
                    ArrayParser parser = new ArrayParser();
                    String[] array = fileWork.readFileLines("src/test/resources/ArraysForFileWork.txt");
                    out.println("See initial arrays in ArraysForFileWork.txt, sorted arrays in ArraysForFileWorkSorted.txt in resources package.");
                    String[] sortedArray = new String[array.length];
                    for (int i = 0; i < array.length; i++) {
                        sortedArray[i] = Arrays.toString(sort.sortArrayAscBubble(parser.stringToIntArray(array[i], ",")));
                        sortedArray[i] = sortedArray[i].replace("[", "");
                        sortedArray[i] = sortedArray[i].replace("]", "");
                        sortedArray[i] = sortedArray[i].replace(" ", "");
                    } // create array of String values that are sorted ints
                    fileWork.writeFileLines(sortedArray, "src/test/resources/ArraysForFileWorkSorted.txt");
                    break;
                case "0":
                    doAgain = false;
                    break;
                default:
                    out.println("There is no such an option.");
            }
        } while (doAgain);
    }
}

