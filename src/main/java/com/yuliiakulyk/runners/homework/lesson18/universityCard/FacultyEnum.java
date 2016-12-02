package com.yuliiakulyk.runners.homework.lesson18.universityCard;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public enum FacultyEnum {

    GEOGRAPHY("geography"), ECONOMICS("economics"), HISTORY("history"), COMPUTER_SCIENCE("computer science"),
    MATHEMATICS("mathematics"), PSYCHOLOGY("psychology"), SOCIOLOGY("sociology"), PHYSICS("physics"),
    PHILOSOPHY("philosophy"), CHEMISTRY("chemistry"), LAW("law"), GEOLOGY("geology"),
    LINGUISTICS("linguistics"), JOURNALISM("journalism"), MILITARY("military");

    private String name;

    FacultyEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
