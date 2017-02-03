package com.yuliiakulyk.app.ArraysAndSorting;

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
            oddElements += Math.abs(i % 2); // number of odd elements between min and max
            if (Math.abs(i % 2) == 1) {
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

    public int arrayMin(int[] arrayInput) {
        int[] array = arrayInput.clone();
        Arrays.sort(array);
        int min = array[0];
        return min;
    }

    public int arrayIndexOf(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                //index = i;
                //break;
                return i;
            }
        }
        return index;
    }

    public int arrayMax(int[] arrayInput) {
        int[] array = arrayInput.clone();
        Arrays.sort(array);
        int max = array[array.length - 1];
        return max;
    }

    public int arrayMax2Dim(int[][] array) {
        int[] maxArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            maxArray[i] = array[i][array[i].length - 1];
        }
        Arrays.sort(maxArray);
        int max = maxArray[maxArray.length - 1];
        return max;
    }

    public int equalPositiveElementsIn2Arrays(int[] array1, int[] array2) {
        int duplicates = 0;
        int[] a1 = new int[array1.length];
        System.arraycopy(array1, 0, a1, 0, array1.length);
        int[] a2 = new int[array2.length];
        System.arraycopy(array2, 0, a2, 0, array2.length);
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    duplicates++;
                    a2[j] = -1;
                }
            }

        }
        return duplicates;
    }

}
