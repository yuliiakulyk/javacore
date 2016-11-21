package com.yuliiakulyk.app.homework.lesson15;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 21.11.2016.
 */
public abstract class Bicycle {
    int speed;
    int gear;
    public void ride() {
        out.println("Wroom!");
    }

    abstract void setSpeed(int speed);

    abstract void setGear(int gear);
}
