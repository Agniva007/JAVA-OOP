package com.agniva.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();

        circle.area();
        shape.area();
        square.area();
        triangle.area();
    }
}
