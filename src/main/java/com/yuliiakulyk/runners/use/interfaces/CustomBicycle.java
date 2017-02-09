package com.yuliiakulyk.runners.use.interfaces;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 21.11.2016.
 */
public class CustomBicycle extends Bicycle {
    @Override
    public void ride() {
        out.println("Wshhhh!");
    }

    @Override
    void setSpeed(int speed) {
        this.speed = speed;
        out.printf("Speed is %d.\n", this.speed);
    }

    @Override
    void setGear(int gear) {
        this.gear = gear;
        out.printf("Gear is %d.\n", this.gear);
    }
}
