package com.yuliiakulyk.runners.classwork.lesson14;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 19.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Person pers;
        pers = new Teacher("John", "Kit Center");
        out.println(pers.getResponse("Teacher question"));
        pers = new Student("Vova", "Kit Center");
        out.println(pers.getResponse("Student question"));
    }
}
