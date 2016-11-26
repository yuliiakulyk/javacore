package com.yuliiakulyk.app.homework.lesson16;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Yuliia Kulyk on 26.11.2016.
 */
public enum Celebrities {
    TINA_TERNER("Tina Terner", 27, 11, 1939),
    KEANU_REEVES("Keanu Reeves", 2, 9, 1964),
    BEYONCE("Beyonce", 4, 9, 1981),
    HUGH_GRANT("Hugh Grant", 9, 9, 1960),
    MARC_ANTHONY("Marc Anthony", 16, 9, 1968),
    MEL_GIBBSON("Mel Gibbson", 3, 1, 1956),
    ADRIANO_CELENTANO("Andiano Celentano", 6, 1, 1938);

    private String name;
    private LocalDate birthday;
    private int ageInFullYears;

    Celebrities(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = LocalDate.of(year, month, day);
        this.ageInFullYears = getAge(birthday);
    }

    public int getAge(LocalDate birthday) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }

    public static void main(String[] args) {
        System.out.println(KEANU_REEVES.ageInFullYears);
    }
}
