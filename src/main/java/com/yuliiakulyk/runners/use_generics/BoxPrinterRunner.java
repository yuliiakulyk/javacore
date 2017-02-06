package com.yuliiakulyk.runners.use_generics;

/**
 * Created by Yuliia Kulyk on 30.11.2016.
 */
public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);
// Here is runtime error of class casting assignment
        Integer intValue2 = (Integer) value2.getValue();
    }
}
