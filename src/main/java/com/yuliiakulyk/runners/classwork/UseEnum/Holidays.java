package com.yuliiakulyk.runners.classwork.UseEnum;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 26.11.2016.
 */
public enum Holidays {
    NEW_YEAR(1, "January", "New Year"), YULIIA_BIRTHDAY(28, "July", "Yuliia Birthday");
    int date;
    String month;
    String name;

    private Holidays(int date, String month, String name) {
        this.date = date;
        this.month = month;
        this.name = name;
    }

    public static void main(String[] args) {
        for (Holidays hName: Holidays.values()) {
            System.out.println(hName.name + " holiday is celebrated on the "+ hName.date + "th of " + hName.month + ".");
        }

        Arrays.asList(Holidays.values()).forEach(holiday ->
                System.out.println(holiday.name + " is celebrated on the " + holiday.date + "th of " + holiday.month + ".")
        );

    }

}
