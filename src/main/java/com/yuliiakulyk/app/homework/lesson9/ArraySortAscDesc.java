package com.yuliiakulyk.app.homework.lesson9;

/**
 * Created by Yuliia Kulyk on 29.10.2016.
 */
public class ArraySortAscDesc {
    public int[] sortArrayAsc(int[] array) {
        boolean exchange;
        do {
            exchange = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array = exchangeArrayElements(array, i);
                    exchange = true;
                }
            }
        } while (exchange);
        return array;
    }

    public int[] sortArrayDesc(int[] array) {
        boolean exchange;
        do {
            exchange = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    array = exchangeArrayElements(array, i);
                    exchange = true;
                }
            }
        } while (exchange);
        return array;
    }

    public int[] exchangeArrayElements(int[] array, int i) {
        int k;
        k = array[i];
        array[i] = array[i + 1];
        array[i + 1] = k;
        return array;
    }
}
