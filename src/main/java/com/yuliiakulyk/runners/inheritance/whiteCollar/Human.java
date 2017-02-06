package com.yuliiakulyk.runners.inheritance.whiteCollar;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 17.11.2016.
 */
public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
            out.println("New age is set.");
        } else
            out.println("Age invalid.");
    }

}
