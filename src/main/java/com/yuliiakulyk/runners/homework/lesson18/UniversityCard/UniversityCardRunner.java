package com.yuliiakulyk.runners.homework.lesson18.UniversityCard;

import com.yuliiakulyk.app.homework.lesson12.ArrayParser;
import com.yuliiakulyk.app.utils.FileWork;

import java.util.ArrayList;

import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public class UniversityCardRunner {

    public void addPeopleToArrayList(String[] fileLines, ArrayList<University> arrayList) {
        String[] personData;
        ArrayParser parser = new ArrayParser();
        for (String line : fileLines) {
            personData = parser.stringToStringArray(line, ",");
            if (personData.length == 4) {
                arrayList.add(new Employee(personData[0], personData[1], personData[2], personData[3]));
            } else if (personData.length == 5) {
                arrayList.add(new Student(personData[0], personData[1], personData[2], personData[3], personData[4]));
            }
        }
    }

    public static void main(String[] args) {
        FileWork fileWork = new FileWork();
        String[] fileLinesEmployees = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson18/employees.csv");
        ArrayList<University> employeesArrayList = new ArrayList<>();
        ArrayList<University> studentsArrayList = new ArrayList<>();
        UniversityCardRunner universityCardRunner = new UniversityCardRunner();
        universityCardRunner.addPeopleToArrayList(fileLinesEmployees, employeesArrayList);
        String[] fileLinesStudents = fileWork.readFileLines("src/main/java/com/yuliiakulyk/runners/homework/lesson18/students.csv");
        universityCardRunner.addPeopleToArrayList(fileLinesStudents, studentsArrayList);
        boolean doAgain = true;
        do {
            System.out.println("Please choose the category to search in.");
            System.out.println("Type 1 to search among all, 2 - employees, 3 - students.");
            System.out.println("Type \"exit\" to close the program.");
            String searchType = getKeyboardInput();
            String searchQuery;
            switch (searchType) {
                case "1":
                    searchQuery = universityCardRunner.saveKeyboardInputToVariable();
                    ArrayList<University> searchResult = new ArrayList<>();
                    searchResult.addAll(universityCardRunner.findEveryone(searchQuery, studentsArrayList));
                    searchResult.addAll(universityCardRunner.findEveryone(searchQuery, employeesArrayList));
                    universityCardRunner.printSearchResult(searchResult, false);
                    break;
                case "2":
                    searchQuery = universityCardRunner.saveKeyboardInputToVariable();
                    universityCardRunner.printSearchResult(universityCardRunner.findInCategory(searchQuery, employeesArrayList), true);
                    break;
                case "3":
                    searchQuery = universityCardRunner.saveKeyboardInputToVariable();
                    universityCardRunner.printSearchResult(universityCardRunner.findInCategory(searchQuery, studentsArrayList), true);
                    break;
                case "exit":
                    doAgain = false;
                    break;
                default:
                    System.out.println("There is no such an option.");
            }
        } while (doAgain);
    }

    public String saveKeyboardInputToVariable() {
        System.out.println("Please type your search query.");
        return getKeyboardInput();
    }

    public ArrayList<University> findEveryone(String searchQuery, ArrayList<University> array) {
        ArrayList<University> searchResult = new ArrayList<>();
        for (University person : array) {
            if ((person.name.toLowerCase().contains(searchQuery.toLowerCase())) ||
                    (person.surname.toLowerCase().contains(searchQuery.toLowerCase()))) {
                searchResult.add(person);
            }
        }
        return searchResult;
    }

    public <T extends University> ArrayList<T> findInCategory(String searchQuery, ArrayList<T> array) {
        ArrayList<T> searchResult = new ArrayList<>();
        for (T person : array) {
            if (person.toString().toLowerCase().contains(searchQuery.toLowerCase())) {
                searchResult.add(person);
            }
        }
        return searchResult;
    }

    public <T extends University> void printSearchResult(ArrayList<T> array, boolean printFullInfo) {
        for (T person : array) {
            if (printFullInfo) {
                System.out.println(person.toString());
            } else {
                System.out.println(person.nameSurnameToString());
            }
        }
        if (array.size() == 0) {
            System.out.println("There is no search results for your query.");
        }
    }
}



