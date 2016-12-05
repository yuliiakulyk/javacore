package com.yuliiakulyk.runners.homework.lesson19;

import com.yuliiakulyk.app.homework.lesson12.ArrayParser;
import com.yuliiakulyk.app.utils.FileWork;

import java.util.*;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;

/**
 * Created by Yuliia Kulyk on 05.12.2016.
 */
public class ContactRunner {
    TreeMap<String, ArrayList<Contact>> map;

    public static void main(String[] args) {
        ContactRunner runner = new ContactRunner();
        FileWork fileWork = new FileWork();
        String[] linesFromFile = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson19/contacts.csv");
        ArrayParser parser = new ArrayParser();
        String[] contactData;
        runner.map = new TreeMap();
        ArrayList<Contact> contacts = new ArrayList<>();
        for(String line: linesFromFile) {
            contactData = parser.stringToStringArray(line, ",");
            contacts = runner.map.get(contactData[0]);
            contacts.add(new Contact(contactData[1], contactData[2]));
            runner.map.put(contactData[0], contacts);
        }
        runner.printCategories(runner.map);
        String categoryInput;
        do {
            System.out.println("Please enter a category to work with:");
            categoryInput = getKeyboardInput();
            if (categoryInput.equalsIgnoreCase("exit")) {
                // write everything to the file here.
                System.out.println("Work is finished.");
                break;
            }
            if (runner.keyExistsInMap(categoryInput, runner.map)) {
                //print existing contacts with numbers, add or edit them
            } else {
                //add new category, add contacts
            }
        } while (true);

    }

    public void printCategories(TreeMap map) {
        Set set = map.keySet();
        for(Object item: set) {
            System.out.println(item.toString());
        }
    }

//    public boolean keyExistsInMap(String categoryName) {
//        TreeSet<String> setOfCategories = (TreeSet) this.map.keySet();
//        for(String category: setOfCategories) {
//            if (category.equalsIgnoreCase(categoryName)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean keyExistsInMap(String categoryName, TreeMap<String, ArrayList<Contact>> map) {
        TreeSet<String> setOfCategories = (TreeSet) map.keySet();
        for(String category: setOfCategories) {
            if (category.equalsIgnoreCase(categoryName)) {
                return true;
            }
        }
        return false;
    }

    public void printContactsInCategory() {
        //
    }

    public void readContactsFromFile() {
        FileWork fileWork = new FileWork();
        String[] linesFromFile = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson19/contacts.csv");
        ArrayList<String[]> linesParsed = new ArrayList<>();
        ArrayParser parser = new ArrayParser();
        for (int i = 0; i < linesFromFile.length; i++) {
            linesParsed.add(i, parser.stringToStringArray(linesFromFile[i], ","));
        }
        for (int j = 0; j < linesParsed.size(); j++) {
            
        }
        String[] contactData;
        this.map = new TreeMap();
        for(String line: linesFromFile) {
            contactData = parser.stringToStringArray(line, ",");
            Set set = map.keySet();

        }
        //this.map.put(contactData[0], new Contact(contactData[1], contactData[2]));
    }
}
