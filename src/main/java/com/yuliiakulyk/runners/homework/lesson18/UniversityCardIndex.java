package com.yuliiakulyk.runners.homework.lesson18;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.yuliiakulyk.app.homework.lesson12.ArrayParser;
import com.yuliiakulyk.app.utils.FileWork;

import java.util.ArrayList;
import java.util.Arrays;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public class UniversityCardIndex {
    public void addPeopleToArrayList(String[] fileLines, ArrayList arrayList) {
        String[] personData;
        ArrayParser parser = new ArrayParser();
        for(String line : fileLines) {
            personData = parser.stringToStringArray(line,",");
            if(personData.length == 4) {
                arrayList.add(new Employee(personData[0], personData[1], personData[2], personData[3]));
            } else if (personData.length == 5) {
                arrayList.add(new Student(personData[0], personData[1], personData[2], personData[3], personData[4]));
            }
        }
    }

    public static void main(String[] args) {
        FileWork fileWork = new FileWork();
        String[] fileLinesEmployees = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson18/employees.csv");
        ArrayList<University> universityArrayList = new ArrayList<>();
        UniversityCardIndex universityCardIndex = new UniversityCardIndex();
        universityCardIndex.addPeopleToArrayList(fileLinesEmployees, universityArrayList);
        String[] fileLinesStudents = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson18/students.csv");
        universityCardIndex.addPeopleToArrayList(fileLinesStudents, universityArrayList);
        System.out.println("Please choose the category to search in.");
        System.out.println("Type 1 to search among all, 2 - employees, 3 - students.");
        String searchType = getKeyboardInput();
        System.out.println("Please type your search query.");
        String searchQuery = getKeyboardInput();
        switch (searchType) {
            case "1":
                universityCardIndex.printSearchResult(universityCardIndex.findEveryone(searchQuery, universityArrayList));
                break;
            case "2":
                universityCardIndex.printSearchResult(universityCardIndex.findInCategory(searchQuery, universityArrayList));
                break;
            case "3":
                universityCardIndex.printSearchResult(universityCardIndex.findInCategory(searchQuery, universityArrayList));
                break;
            default:
                System.out.println("There is no such an option.");

        }
    }

    public ArrayList<University> findEveryone(String searchQuery, ArrayList<University> array) {
        ArrayList<University> searchResult = new ArrayList<>();
        for(University person : array) {
            if ((person.name.toLowerCase().contains(searchQuery.toLowerCase())) ||
                    (person.surname.toLowerCase().contains(searchQuery.toLowerCase()))) {
                searchResult.add(person);
            }
        }
        return searchResult;
    }

    public <T extends University> ArrayList<T> findInCategory(String searchQuery, ArrayList<T> array) {
        ArrayList<T> searchResult = new ArrayList<>();
        for (T person: array) {
            if (person.toString().toLowerCase().contains(searchQuery.toLowerCase())) {
                searchResult.add(person);
            }
        }
        return searchResult;
    }

    public <T extends University> void printSearchResult(ArrayList<T> array) {
        for(T person: array) {
            System.out.println(person.toString());
        }
        if (array.size() == 0) {
            System.out.println("There is no search results for your query.");
        }
    }
}
