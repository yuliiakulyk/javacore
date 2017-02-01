package com.yuliiakulyk.runners.homework.lesson13;

import com.yuliiakulyk.app.classwork.WorkWithString.Palindrome;
import com.yuliiakulyk.app.homework.lesson12.ArrayParser;
import com.yuliiakulyk.app.homework.lesson9.ArraySortAscDesc;
import com.yuliiakulyk.app.utils.FileWork;

import java.util.Arrays;

import static com.yuliiakulyk.runners.utils.KeyboardInput.consoleToStringArray;
import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;
import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 26.11.2016.
 */
public class Hometask13WithEnum {

    public static void main(String[] args) {
        boolean doAgain = true;
        FileWork fileWork = new FileWork();
        String input;
        EnumHometask enumHometask;
        do {
            out.println("Please select number of a problem to solve:");
            out.println("A - Read int arrays from a file, sort and write to another file.");
            out.println("B - Read lines in one file and save them in another file with indication if they are palindromes.");
            out.println("C - Read input from console and save it to file.");
            out.println("D - Exit.");
            try {
                enumHometask = EnumHometask.valueOf(getKeyboardInput().toUpperCase());
                switch (enumHometask) {
                    case A:
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
                    case B:
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
                    case C:
                        array = consoleToStringArray("exit");
                        out.println("Please, enter a file name, excluding its format");
                        String fileName = getKeyboardInput();
                        fileWork.writeFileLines(array, "src/test/resources/" + fileName + ".txt");
                        out.println("Please see result in file src/test/resources/" + fileName + ".txt");
                        break;
                    case D:
                        doAgain = false;
                        break;
                    default:
                        System.out.println("There is no such a task. Try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("There is no such a task. Try again.");
            }

        } while (doAgain);
    }

}
