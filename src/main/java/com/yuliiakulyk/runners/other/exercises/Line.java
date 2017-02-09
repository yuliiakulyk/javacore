package com.yuliiakulyk.runners.other.exercises;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 19.11.2016.
 */
public class Line {
    Pixel[] line; // = new Pixel[2];

    public Line (Pixel pixel1, Pixel pixel2) {
        this.line = new Pixel[2];
        this.line[0] = pixel1;
        this.line[1] = pixel2;
    }

    public void add(Pixel pixel) {
        Pixel[] newLine = new Pixel[this.line.length + 1];
        for (int i = 0; i < this.line.length; i++) {
            newLine[i] = this.line[i];
        }
        newLine[this.line.length] = pixel;
        this.line = newLine;
    }

    public static void main(String[] args) {
        Pixel pixel1 = new Pixel(10, 20);
        Pixel pixel2 = new Pixel(20, 30);
        Line myLine = new Line(pixel1, pixel2);
        Pixel pixel3 = new Pixel (25, 40);
        myLine.add(pixel3);
        for (int i = 0; i <= 2; i++) {
            out.println(myLine.line[i].getCoordinates()[0]);
            out.println(myLine.line[i].getCoordinates()[1]);
        }
    }

}
