package com.yuliiakulyk.runners.expressions_control_statements;

/**
 * Created by 123 on 22.10.2016.
 */
public class PrePostIncrements {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment " + a);
    }
}
