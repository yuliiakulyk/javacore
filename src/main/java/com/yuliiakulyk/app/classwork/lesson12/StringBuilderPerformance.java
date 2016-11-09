package com.yuliiakulyk.app.classwork.lesson12;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 09.11.2016.
 */
public class StringBuilderPerformance {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        String b = "finish";
        for (long i = 0; i < 100000L; i++) {
            c = c.append(b);
        }
        long end = System.currentTimeMillis();
        out.println(end - start);
    }
}
