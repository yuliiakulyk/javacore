package com.yuliiakulyk.runners.classwork.lesson14;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 19.11.2016.
 */
public class Teacher extends Person {
    private String university;

    public Teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public String lessonFinished() {
        return "Do not forget to do the homework!";
    }
}