package com.yuliiakulyk.runners.homework.lesson18;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public class Student extends University {
    public CourseEnum course;
    public StatusEnum status;

    public Student (String name, String surname, String faculty, String course, String status) {
        this.name = name;
        this.surname = surname;
        this.faculty = FacultyEnum.valueOf(faculty.toUpperCase());
        this.course = CourseEnum.valueOf(course.toUpperCase());
        this.status = StatusEnum.valueOf(status.toUpperCase());
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + faculty.getName() + ", " + course.getCourse() + ", " + status.statusName;
    }
}
