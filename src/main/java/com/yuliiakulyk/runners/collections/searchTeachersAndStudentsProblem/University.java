package com.yuliiakulyk.runners.collections.searchTeachersAndStudentsProblem;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public abstract class University {
    String name;
    String surname;
    FacultyEnum faculty;

    public String nameSurnameToString() {
       return name + " " + surname;
    }

}
