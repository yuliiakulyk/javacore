package com.yuliiakulyk.runners.homework.lesson18;

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
