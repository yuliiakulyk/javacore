package com.yuliiakulyk.runners.homework.lesson18.universityCard;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public enum CourseEnum {
    FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), SIXTH(6);

    int course;
    CourseEnum(int course) {
        this.course = course;
    }

    public String getCourse() {
        return "" + course;
    }
}
