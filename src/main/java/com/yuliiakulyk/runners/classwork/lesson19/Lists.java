package com.yuliiakulyk.runners.classwork.lesson19;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Yuliia Kulyk on 03.12.2016.
 */
public class Lists {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        int theSize = myList.size();
        System.out.println("List size is " + theSize);
        System.out.println("Index of \"" + string1 + "\" is " + myList.indexOf(string1));
        myList.remove(string1);
        myList.add("asdf");
        myList.add("123034");
        myList.add("9879");
        myList.add("sdfj");
        myList.add(".....");
        myList.add("////");
        myList.add("----");
        Collections.sort(myList);
        System.out.println(myList.toString());
    }

}
