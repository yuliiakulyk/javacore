package com.yuliiakulyk.app.UseEnum;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Yuliia Kulyk on 26.11.2016.
 */
public enum Celebrities {
    TINA_TURNER("Tina Turner", 27, 11, 1939),
    KEANU_REEVES("Keanu Reeves", 2, 9, 1964),
    BEYONCE("Beyonce", 4, 9, 1981),
    HUGH_GRANT("Hugh Grant", 9, 9, 1960),
    MARC_ANTHONY("Marc Anthony", 16, 9, 1968),
    MEL_GIBSON("Mel Gibson", 3, 1, 1956),
    ADRIANO_CELENTANO("Adriano Celentano", 6, 1, 1938),
    ASHTON_CUTCHER("Ashton Cutcher", 7, 2, 1978),
    LEONARDO_DICAPRIO("Leonardo DiCaprio", 11, 11, 1974),
    GERARD_BUTLER("Gerard Butler", 13, 11, 1969),
    KATHERINE_HEIGL("Katherine Heigl", 24, 11, 1978),
    BRITNEY_SPEARS("Britney Spears", 2, 12, 1981),
    JAY_Z("Jay Z", 4, 12, 1969),
    NICOLAS_CAGE("Nicolas Cage", 7, 1, 1964),
    MICHELLE_OBAMA("Michelle Obama", 17, 1, 1964),
    SHAKIRA("Shakira", 2, 2, 1977);

    public String name;
    public LocalDate birthday;
    public int ageInFullYears;

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
