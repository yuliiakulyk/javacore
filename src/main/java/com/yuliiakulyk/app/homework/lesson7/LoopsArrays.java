package com.yuliiakulyk.app.homework.lesson7;

import java.util.Arrays;


/**
 * Created by Yuliia Kulyk on 27.10.2016.
 */
public class LoopsArrays {

    public int[] getEvenOddArrayFromTo(int min, int max, boolean isEven) {
        int oddElements = 0;
        int minOddElement = 0;
        int minEvenElement = 0;
        for (int i = max; i >= min; i--) {
            oddElements += i % 2; // number of odd elements between min and max
            if (i % 2 == 1) {
                minOddElement = i; // get the smallest odd element in the range by the end of cycle
            } else {
                minEvenElement = i; // get the smallest even element in the range by the end of cycle
            }
        }
        int evenElements = max - min + 1 - oddElements; // number of even elements between min and max
        int[] array;
        if (isEven) {
            array = new int[evenElements];
            for (int i = 0; i < evenElements; i++) {
                array[i] = minEvenElement;
                minEvenElement += 2;
            }
        } else {
            array = new int[oddElements];
            for (int i = 0; i < oddElements; i++) {
                array[i] = minOddElement;
                minOddElement += 2;
            }
        }
        return array;
    }

    public int evenInArray(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public int arrayMin(int[] array) {
        Arrays.sort(array);
        int min = array[0];
        return min;
    }

    public int arrayMax(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;
    }
}
