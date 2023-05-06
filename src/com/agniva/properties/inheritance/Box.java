package com.agniva.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    public double getL() {
        return l;
    }

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
