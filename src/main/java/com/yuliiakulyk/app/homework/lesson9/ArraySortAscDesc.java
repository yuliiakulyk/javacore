package com.yuliiakulyk.app.homework.lesson9;

import com.yuliiakulyk.app.homework.lesson7.LoopsArrays;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class ArraySortAscDesc {
    public int[] sortArrayAscBubble(int[] array) {
        boolean exchange;
        do {
            exchange = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array = exchangeArrayElements(array, i, i + 1);
                    exchange = true;
                }
            }
        } while (exchange);
        return array;
    }

    public int[] sortArrayDescBubble(int[] array) {
        boolean exchange;
        do {
            exchange = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    array = exchangeArrayElements(array, i, i + 1);
                    exchange = true;
                }
            }
        } while (exchange);
        return array;
    }

    public int[] exchangeArrayElements(int[] array, int i, int j) {
        int k;
        k = array[i];
        array[i] = array[j];
        array[j] = k;
        return array;
    }
    public int[] sortArrayAscSelection (int[] array) {
        LoopsArrays loopsArrays = new LoopsArrays();
        int j;
        int min;
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            int[] restOfArray = Arrays.copyOfRange(array, i + 1, array.length);
            min = loopsArrays.arrayMin(restOfArray);
            minIndex = loopsArrays.arrayIndexOf(array, min);
            if (array[i] > min) {
                array = exchangeArrayElements(array, i, minIndex);
            }
        }
        return array;
    }
    public int[] sortArrayDescSelection (int[] array) {
        LoopsArrays loopsArrays = new LoopsArrays();
        int j;
        int max;
        int maxIndex;
        for (int i = 0; i < array.length - 1; i++) {
            int[] restOfArray = Arrays.copyOfRange(array, i + 1, array.length);
            max = loopsArrays.arrayMax(restOfArray);
            maxIndex = loopsArrays.arrayIndexOf(array, max);
            if (array[i] < max) {
                array = exchangeArrayElements(array, i, maxIndex);
            }
        }
        return array;
    }
}
