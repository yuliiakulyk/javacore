package com.yuliiakulyk.runners.classwork.lesson14;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 19.11.2016.
 */
public class Teacher extends Person {
    private String university;
    private String response;

    public Teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public void printOnTable() {
        out.println("Assume this is table)):" + response);
    }
}
