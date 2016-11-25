package com.yuliiakulyk.runners.classwork.lesson14;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
public class Student extends Person {
    private String university;

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question) {
        return "Ehhh, what was the question?";
    }

}
