package com.yuliiakulyk.runners.cycles;

import static java.lang.System.out;

/**
 * Created by 123 on 22.10.2016.
 */
public class EvenNumbersPrinter {
    public static void main(String[] args) {
        int quantity = 0;
        for (int i = 0; i <= 20; i += 2) {
            quantity++;
            out.println(i);
        }
        out.println("Quantity of even numbers = " + quantity);
    }
}
