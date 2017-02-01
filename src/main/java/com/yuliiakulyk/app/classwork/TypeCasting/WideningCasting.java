package com.yuliiakulyk.app.classwork.TypeCasting;

/**
 * Created by Юлия on 08.10.2016.
 */
public class WideningCasting {

    public double widening(byte byte1) {
        short short1;
        int int1;
        long long1;
        float float1;
        double double1;
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
        return double1;
    }
}
