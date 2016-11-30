package com.yuliiakulyk.runners.classwork.lesson17;

import java.util.ArrayList;

/**
 * Created by Yuliia Kulyk on 30.11.2016.
 */
public class Generics {
    public static void main(String[] args) {
        int intNumber = 5;
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(intNumber);
        System.out.println(numbers.get(0));
    }
}