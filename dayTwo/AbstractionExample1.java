package com.dayTwo;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void calculateArea() {
        System.out.println("Rectangle Area = " + (length * width));
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.calculateArea();
        s2.calculateArea();
    }
}