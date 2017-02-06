package com.yuliiakulyk.runners.use_generics;

import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 30.11.2016.
 */
public class ArraySortGenerics <T extends Number> {
    private T[] t;
    public ArraySortGenerics(T[] t) {
        this.t = t;
    }

    public T[] sort() {
        int j;
        boolean flag = true;
        T temp;
        while (flag) {
            flag = false;
            for (j = 0; j < t.length - 1; j++) {
                if (t[j].doubleValue() < t[j + 1].doubleValue()) {
                    temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return t;
    }

    public static <T extends Number> T[] sort (T[] array) {
        ArraySortGenerics<T> arraySortGenerics = new ArraySortGenerics<T>(array);
        return arraySortGenerics.sort();
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = 100 + i;
        }
        ArraySortGenerics<Integer> arraySortGenerics = new ArraySortGenerics<>(integers);
        System.out.println(Arrays.toString(integers));
        Integer[] sort = arraySortGenerics.sort();
        Integer[] sort2 = sort(integers);
        System.out.println(Arrays.toString(sort));
        System.out.println(Arrays.toString(sort2));
        Byte[] bytes = {1, 3, 7, 0, -3};
        ArraySortGenerics<Byte> arraySortGenerics1 = new ArraySortGenerics<>(bytes);
        Byte[] sortedByteArray = arraySortGenerics1.sort();
        System.out.println(Arrays.toString(sortedByteArray));
    }
}
