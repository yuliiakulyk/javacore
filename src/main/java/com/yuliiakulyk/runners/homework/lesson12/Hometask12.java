package com.yuliiakulyk.runners.homework.lesson12;

import com.yuliiakulyk.app.homework.lesson12.ArrayParser;
import com.yuliiakulyk.app.homework.lesson9.ArraySortAscDesc;

import java.util.Arrays;

import static com.yuliiakulyk.app.utils.convertors.KeyboardInput.getKeyboardInput;
import static java.lang.System.out;
import static com.yuliiakulyk.runners.utils.Printers.*;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class Hometask12 {
    public static void main(String[] args) {
        ArrayParser arrayParser = new ArrayParser();
        ArraySortAscDesc sort = new ArraySortAscDesc();
        boolean doAgain = true;
        do {
            out.println("Select the problem to solve");
            out.println("1 - Sort numbers from a string with separators");
            out.println("2 - Extract alphabet letters from a string with separators");
            out.println("3 - Print a string separated by keyword splitted into lines");
            out.println("0 - Exit");
            switch (getKeyboardInput()) {
                case "1":
                    out.println("Please enter numbers to sort separated by semicolon:");
                    int[] array = arrayParser.stringToIntArray(getKeyboardInput());
                    out.println("Choose direction to sort the array.");
                    out.println("Enter \"U\" to sort from smaller to bigger.");
                    out.println("Enter \"D\" to sort from bigger to smaller.");
                    switch (getKeyboardInput().toLowerCase()) {
                        case "u":
                            printArrayOneLine(sort.sortArrayAscBubble(array));
                            break;
                        case "d":
                            printArrayOneLine(sort.sortArrayDescBubble(array));
                            break;
                        default:
                            out.println("There is no such a sorting order.");
                    }
                    break;
                case "2":
                    out.println("Please enter a string using comma as separator.");
                    String stringWithAlphabet = getKeyboardInput();
                    out.println(arrayParser.alphabetFromStringArray(arrayParser.stringToStringArray(stringWithAlphabet, ",")));
                    break;
                case "3":
                    out.println("Enter a string.");
                    String string = getKeyboardInput();
                    out.println("Enter a separator.");
                    String separator = getKeyboardInput();
                    for (int i = 0; i < arrayParser.stringToStringArray(string, separator).length; i++) {
                        out.println(arrayParser.stringToStringArray(string, separator)[i].trim());
                    }
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
