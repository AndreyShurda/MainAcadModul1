package com.shurda.andrey.basics.Lab2_7.oop.testshapes;

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

//        printArea(area);
        return area;
    }

    public static double sumTriangleArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                sum += shape.calcArea();
            }
        }
        return sum;
    }

    public static Triangle parseTriangle(String stringShape) {
        String[] arrayShape = stringShape.split(":");
        Triangle shape = null;
        if (arrayShape.length == 3) {
            String parameters = arrayShape[2];
            String[] arrayParameters = parameters.split(",");
            if (arrayParameters.length == 3)
                shape = new Triangle(arrayShape[1], Double.parseDouble(arrayParameters[0]), Double.parseDouble(arrayParameters[1]), Double.parseDouble(arrayParameters[2]));
            else
                System.out.println("Not a Triangle");
        } else
            System.out.println("This string can't convert to a Triangle");

        return shape;
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

    @Override
    public void draw() {
        System.out.println(toString() + " area is " + calcArea());
    }

}
