package com.yuliiakulyk.runners.homework.lesson12;

import com.yuliiakulyk.app.homework.lesson12.ArrayParser;
import com.yuliiakulyk.app.homework.lesson9.ArraySortAscDesc;

import static com.yuliiakulyk.app.utils.convertors.KeyboardInput.getKeyboardInput;
import static java.lang.System.out;
import static com.yuliiakulyk.runners.utils.Printers.*;

/**
 * Created by Yuliia Kulyk on 12.11.2016.
 */
public class ArrayParserRunner {
    public static void main(String[] args) {
        ArrayParser arrayParser = new ArrayParser();
        ArraySortAscDesc sort = new ArraySortAscDesc();
        out.println("Please enter numbers to sort separated by semicolon:");
        int[] array = arrayParser.stringToIntArray(getKeyboardInput());
        out.println("Choose direction to sort the array.");
        out.println("Enter \"up\" to sort from smaller to bigger.");
        out.println("Enter \"down\" to sort from bigger to smaller.");
        switch (getKeyboardInput()) {
            case "up":
                printArrayOneLine(sort.sortArrayAscBubble(array));
                break;
            case "down":
                printArrayOneLine(sort.sortArrayDescBubble(array));
                break;
            default:
                out.println("There is no such a sorting order.");
        }
        String[] stringWithAlphabet = {"a", "hello", "A", "Z", "uuu", "e", "788"};
        out.println(arrayParser.alphabetFromStringArray(stringWithAlphabet));
    }

}
