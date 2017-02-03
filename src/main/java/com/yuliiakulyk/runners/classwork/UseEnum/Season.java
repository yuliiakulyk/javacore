package com.yuliiakulyk.runners.classwork.UseEnum;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 26.11.2016.
 */
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public static void main(String[] args) {
        System.out.println(SPRING.name());
        System.out.println(SPRING.toString());
        System.out.println(Season.values());
        System.out.println(Arrays.toString(Season.values()));
        try {
            Season season = Season.valueOf("Summer");
            switch (season) {
                case SPRING:
                    System.out.println(season.toString());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection!");
        }

    }

//    @Override
//    public String toString() {
//        return "Season{}";
//    }
}
