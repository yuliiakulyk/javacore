package com.yuliiakulyk.app.ArraysAndSorting;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class ArraySortAscDesc {
    public int[] sortArrayAscBubble(int[] initialArray) {
        int[] array = initialArray.clone();
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

    public int[] sortArrayDescBubble(int[] initialArray) {
        int[] array = initialArray.clone();
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

    public int[] sortArrayAscSelection(int[] initialArray) {
        LoopsArrays loopsArrays = new LoopsArrays();
        int[] array = initialArray.clone();
        int j;
        int min;
        int minIndexRest;
        int minIndexArray;
        for (int i = 0; i < array.length - 1; i++) {
            int[] restOfArray = Arrays.copyOfRange(array, i + 1, array.length);
            min = loopsArrays.arrayMin(restOfArray);
            minIndexRest = loopsArrays.arrayIndexOf(restOfArray, min);
            minIndexArray = i + minIndexRest + 1;
            if (array[i] > min) {
                array = exchangeArrayElements(array, i, minIndexArray);
            }
        }
        return array;
    }

    public int[] sortArrayDescSelection(int[] initialArray) {
        LoopsArrays loopsArrays = new LoopsArrays();
        int[] array = initialArray.clone();
        int max;
        int maxIndexRest;
        int maxIndexArray;
        for (int i = 0; i < array.length - 1; i++) {
            int[] restOfArray = Arrays.copyOfRange(array, i + 1, array.length);
            max = loopsArrays.arrayMax(restOfArray);
            maxIndexRest = loopsArrays.arrayIndexOf(restOfArray, max);
            maxIndexArray = i + maxIndexRest + 1;
            if (array[i] < max) {
                array = exchangeArrayElements(array, i, maxIndexArray);
            }
        }
        return array;
    }
}
