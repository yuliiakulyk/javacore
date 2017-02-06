package com.yuliiakulyk.runners.convertors_and_files.runners;

import com.yuliiakulyk.app.work_with_string.Palindrome;
import com.yuliiakulyk.runners.convertors_and_files.classes.FileWork;
import com.yuliiakulyk.app.arrays_and_sorting.ArraySortAscDesc;
import com.yuliiakulyk.app.use_string_builder.ArrayParser;

import static com.yuliiakulyk.runners.utils.KeyboardInput.*;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 13.11.2016.
 */
public class FileProblemsRunner {
    public static void main(String[] args) {
        boolean doAgain = true;
        FileWork fileWork = new FileWork();
        do {
            out.println("Please select number of a problem to solve:");
            out.println("1 - Read int arrays_and_sorting from a file, sort and write to another file.");
            out.println("2 - Read lines in one file and save them in another file with indication if they are palindromes.");
            out.println("3 - Read input from console and save it to file.");
            out.println("0 - Exit.");
            switch (getKeyboardInput()) {
                case "1":
                    ArraySortAscDesc sort = new ArraySortAscDesc();
                    ArrayParser parser = new ArrayParser();
                    String[] array = fileWork.readFileLines("src/test/resources/ArraysForFileWork.txt");
                    out.println("See initial arrays_and_sorting in ArraysForFileWork.txt, sorted arrays_and_sorting in ArraysForFileWorkSorted.txt in resources package.");
                    String[] sortedArray = new String[array.length];
                    for (int i = 0; i < array.length; i++) {
                        sortedArray[i] = Arrays.toString(sort.sortArrayAscBubble(parser.stringToIntArray(array[i], ",")));
                        sortedArray[i] = sortedArray[i].replace("[", "");
                        sortedArray[i] = sortedArray[i].replace("]", "");
                        sortedArray[i] = sortedArray[i].replace(" ", "");
                    } // create array of String values that are sorted ints
                    fileWork.writeFileLines(sortedArray, "src/test/resources/ArraysForFileWorkSorted.txt");
                    break;
                case "2":
                    Palindrome palindrome = new Palindrome();
                    array = fileWork.readFileLines("src/test/resources/input.txt");
                    String[] arrayPalindromes = new String[array.length];
                    boolean isPalindrome;
                    for (int i = 0; i < array.length; i++) {
                        isPalindrome = palindrome.isPalindrome1(array[i]);
                        if (isPalindrome) {
                            arrayPalindromes[i] = array[i] + " is a palindrome.";
                        } else {
                            arrayPalindromes[i] = array[i] + " is not a palindrome.";
                        }
                    }
                    fileWork.writeFileLines(arrayPalindromes, "src/test/resources/outputPalindromes.txt");
                    out.println("Please see result in file src/test/resources/outputPalindromes.txt");
                    break;
                case "3":
                    array = consoleToStringArray("exit");
                    out.println("Please, enter a file name, excluding its format");
                    String fileName = getKeyboardInput();
                    fileWork.writeFileLines(array, "src/test/resources/" + fileName + ".txt");
                    out.println("Please see result in file src/test/resources/" + fileName + ".txt");
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

