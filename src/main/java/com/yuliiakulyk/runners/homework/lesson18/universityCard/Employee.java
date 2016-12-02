package com.yuliiakulyk.runners.homework.lesson18.universityCard;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public class Employee extends University {
    public PositionEnum position;

    public Employee(String name, String surname, String faculty, String position) {
        this.name = name;
        this.surname = surname;
        this.faculty = FacultyEnum.valueOf(faculty.toUpperCase());
        this.position = PositionEnum.valueOf(position.toUpperCase());
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + faculty.getName() + ", " + position.getPositionName();
    }
}
