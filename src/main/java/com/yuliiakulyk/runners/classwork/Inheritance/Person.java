package com.yuliiakulyk.runners.classwork.Inheritance;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public String getResponse(String question) {
        return "My answer is " + question;
    }

}
