package com.yuliiakulyk.runners.use.generics;

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
