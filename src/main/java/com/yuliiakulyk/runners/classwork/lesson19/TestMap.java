package com.yuliiakulyk.runners.classwork.lesson19;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuliia Kulyk on 03.12.2016.
 */
public class TestMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Magnaz", "31");
        m1.put("Ayan", "8");
        m1.put("Daisy", "14");
        System.out.println(m1.get("Zara"));
        System.out.println("Map elements");
        System.out.println("\t" + m1);
        System.out.println("\n" + m1.containsValue(31));
    }
}
