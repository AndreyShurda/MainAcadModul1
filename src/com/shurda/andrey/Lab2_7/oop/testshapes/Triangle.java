package com.shurda.andrey.Lab2_7.oop.testshapes;

import static java.lang.Math.pow;

/**
 * 1) Add to project MyShapes a new class Triangle which is a subclass of Shape.
 * Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
 * In class Triangle override calcArea() method which
 * must return area of triangle (By the formula: area = , where ).
 * In class Triangle override the toString() method. It must return string which contain name of shape,
 * color and a, b, c sides of triangle.
 * <p>
 * Example: “This is Triangle, color: BLACK, a=5, b=5, c=5”
 * Add to class Triangle constructor with color, a, b and c arguments.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (getA() + getB() + getC()) / 2;
        double d = s * (s - getA()) * (s - getB()) * (s - getC());
        double area = pow(d, 0.5);

        printArea(area);
        return area;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}
