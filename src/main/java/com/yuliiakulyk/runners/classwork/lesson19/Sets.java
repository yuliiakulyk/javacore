package com.yuliiakulyk.runners.classwork.lesson19;

import java.util.HashSet;

/**
 * Created by Yuliia Kulyk on 03.12.2016.
 */
public class Sets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a1");
        set.add("a2");
        set.add("d");
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("f");
        System.out.println(set);
    }
}
