package com.yuliiakulyk.runners.homework.lesson18.UniversityCard;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public enum StatusEnum {
    STUDENT("student"), BACHELOR("bachelor"), SPECIALIST("specialist"), MASTER("master");

    String statusName;

    StatusEnum(String statusName) {
        this.statusName = statusName;
    }
}
