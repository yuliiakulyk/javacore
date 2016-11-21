package com.yuliiakulyk.app.homework.lesson15;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;

/**
 * Created by Yuliia Kulyk on 21.11.2016.
 */
public class RandomArrayParametrized extends RandomArrayCreator {
    int size1;
    int size2;

    public RandomArrayParametrized (int size1) {
        this.size1 = size1;
    }

    public RandomArrayParametrized (int size1, int size2) {
        this.size1 = size1;
        this.size2 = size2;
    }

    /*@Override
    public int[] create () {
        RandomArrayGenerators generators = new RandomArrayGenerators();
        if (this.size2 == 0) {
            return
        }
    }*/

}
