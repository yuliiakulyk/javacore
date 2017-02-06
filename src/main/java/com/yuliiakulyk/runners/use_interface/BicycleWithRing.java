package com.yuliiakulyk.runners.use_interface;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 21.11.2016.
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {
    @Override
    public void ring() {
        out.println("Di-ling!");
    }

    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();
        Bicycle bicycle = new CustomBicycle();
        bicycle.setSpeed(20);
        bicycle.setGear(20);
    }
}
