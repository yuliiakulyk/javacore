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
//        FileWork fileWork = new FileWork();
//        String[] linesFromFile = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson19/contacts.csv");
//        ArrayParser parser = new ArrayParser();
//        String[] contactData;
//        runner.map = new TreeMap();
//        ArrayList<Contact> contacts = new ArrayList<>();
//        for(String line: linesFromFile) {
//            contactData = parser.stringToStringArray(line, ",");
//            contacts = runner.map.get(contactData[0]);
//            contacts.add(new Contact(contactData[1], contactData[2]));
//            runner.map.put(contactData[0], contacts);
//        }
        runner.readContactsFromFile();
        runner.printCategories(runner.map);
        String categoryInput;
        do {
            System.out.println("Please enter a category to work with:");
            categoryInput = getKeyboardInput();
            if (categoryInput.equalsIgnoreCase("exit")) {
                runner.writeContactsToFile();
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
        Set<String> set = map.keySet();
        for(String item: set) {
            System.out.println(item);
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
        // строки из файла:
        String[] wholeLinesFromFile = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson19/contacts.csv");
        ArrayList<String[]> parsedLinesFromFile = new ArrayList<>();
        ArrayParser parser = new ArrayParser();
        for (int i = 0; i < wholeLinesFromFile.length; i++) { //добавили массивы разделенных строк в
            parsedLinesFromFile.add(i, parser.stringToStringArray(wholeLinesFromFile[i], ","));
        }
        this.map = new TreeMap();
        ArrayList<Contact> currentCategoryContacts;
        String currentCategory;
        Iterator iterator;
        String[] currentLineStrings;
        while (parsedLinesFromFile.size() != 0) {
            currentCategoryContacts = new ArrayList<>();
            currentCategory = parsedLinesFromFile.get(0)[0];
            iterator = parsedLinesFromFile.iterator();
            while (iterator.hasNext()) {
                currentLineStrings = (String[]) iterator.next();
                if (currentCategory.equalsIgnoreCase((currentLineStrings[0]))) {
                    currentCategoryContacts.add(new Contact(currentLineStrings[1], currentLineStrings[2]));
                    iterator.remove();
                }
                this.map.put(currentCategory, currentCategoryContacts);
            }
        }

    }

    public void writeContactsToFile() {
        Set<String> set = this.map.keySet();
        FileWork fileWork = new FileWork();
        ArrayList<String> linesToWrite = new ArrayList<>();
        ArrayList<Contact> contactsInCategory;
        for(String category: set) {
            contactsInCategory = this.map.get(category);
            for (Contact contact: contactsInCategory) {
                linesToWrite.add(category + "," + contact.getName() + "," + contact.getPhone());
            }

        }
        fileWork.writeFileLines((String[]) linesToWrite.toArray(), "src/main/java/com/yuliiakulyk/runners/homework/lesson19/contacts.csv");
    }
}
