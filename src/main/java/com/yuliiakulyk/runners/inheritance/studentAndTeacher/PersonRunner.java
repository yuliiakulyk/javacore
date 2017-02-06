package com.yuliiakulyk.runners.inheritance.studentAndTeacher;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
public class PersonRunner {
    public static void main(String[] args) {
        Student student = new Student("Egor", "Kit Center");
        out.println(student.getResponse("What is class?"));
        Teacher teacher = new Teacher("Ivan", "Kit Center");
        out.println(teacher.getResponse("What time is now?"));
        Person person = new Student("Ilya", "Kit Center");
        out.println(person.getResponse("What time is now?"));
        person = new Teacher("Evgeniy", "Kit Center");
        out.println(person.getResponse("What time is now?"));
    }
}