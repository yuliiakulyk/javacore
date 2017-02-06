package com.yuliiakulyk.runners.use_interface;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 25.11.2016.
 */
public class HashCodesRunner {
    public class BlackBox {
        int varA;
        int varB;
        public BlackBox(int varA, int varB) {
            this.varA = varA;
            this.varB = varB;
        }
    }

    public static void main(String[] args) {
        HashCodesRunner runner = new HashCodesRunner();
        BlackBox box1 = runner.new BlackBox(5, 10);
        BlackBox box2 = runner.new BlackBox(5, 10);
        out.println("HashCode of box1 = " + box1.hashCode());
        out.println("HashCode of box2 = " + box2.hashCode());
        out.println("box1 equals box1 = " + box1.equals(box1));
        out.println("box1 equals box2 = " + box1.equals(box1));
    }
}
