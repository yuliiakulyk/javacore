package com.yuliiakulyk.runners.homework.lesson18.sortLines;

import java.util.Collection;
import java.util.TreeSet;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;

/**
 * Created by Yuliia Kulyk on 02.12.2016.
 */
public class SortLinesRunner {
    public static void main(String[] args) {
        SortLinesRunner runner = new SortLinesRunner();
        System.out.println("Enter lines using Enter key. Type exit to get sorted lines.");
        runner.printCollection(runner.sortStrings());
    }

    public TreeSet<String> sortStrings() {
        TreeSet<String> treeSet = new TreeSet<>();
        String input;
        do {
            input = getKeyboardInput();
            if (input.equals(""))
                return treeSet;
            else
                treeSet.add(input);
        } while (input != "");
        return treeSet;
    }

    public <T extends Collection> void printCollection(T collection) {
        for (Object item : collection) {
            System.out.println(item.toString());
        }
    }
}
