package com.yuliiakulyk.runners.classwork.lesson3;

import com.yuliiakulyk.app.classwork.lesson3.NarrowingCasting;

/**
 * Created by Юлия on 08.10.2016.
 */
public class NarrowingCastingRunner {
    public static void main(String[] args) {
        NarrowingCasting casting = new NarrowingCasting ();
        float float1 = 5.777f;
        int int1 = casting.narrowing(float1);
    }
}
