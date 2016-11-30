package com.yuliiakulyk.runners.classwork.lesson17;

/**
 * Created by Yuliia Kulyk on 30.11.2016.
 */
public class BoxPrinter {
    private Object val;
    public BoxPrinter(Object arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public Object getValue() {return val;}
}
