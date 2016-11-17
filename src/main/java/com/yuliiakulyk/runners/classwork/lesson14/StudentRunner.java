package com.yuliiakulyk.runners.classwork.lesson14;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("John", "Harvard");
        out.println(student.getName());
        out.println(student.getUniversity());
        out.println(student.getResponse("Who is your philosophy professor?"));
        student.setUniversity("Oxford");
        out.println(student.getUniversity());
    }
}
