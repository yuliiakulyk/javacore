package com.yuliiakulyk.runners.classwork.lesson12;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class StringPerformance {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++) {
            c = c.concat(b);
        }
        long end = System.currentTimeMillis();
        out.println(end - start);
    }
}
