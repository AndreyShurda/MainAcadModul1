package com.shurda.andrey.basics.Lab2_6.com.brainacad.shapes;

import static java.lang.Math.pow;

public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        double d = s * (s - a) * (s - b) * (s - c);
        return pow(d, 0.5);
    }
}
