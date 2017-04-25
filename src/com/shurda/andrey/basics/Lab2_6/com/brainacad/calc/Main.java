package com.shurda.andrey.basics.Lab2_6.com.brainacad.calc;

import com.shurda.andrey.basics.Lab2_6.com.brainacad.shapes.Triangle;

/**
 * Create project MyCalc.
 * Create class Main with main() method in package com.brainacad.calc.
 * Create class  Triangle in package com.brainacad.shapes
 * with three double data fields named “a”, “b”, and “c” with default values 1.0
 * to denote three sides of the triangle. Add constructor with (a,b,c) parameters
 * and creates a triangle with specified a, b, and c values. Add method named getArea()
 * that returns the area if this triangle using Heron formula:
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("The area of triangle default is: " + triangle.getArea());

        Triangle triangle2 = new Triangle(1, 2, 2.5);
        System.out.println("The area of triangle is: " + triangle2.getArea());
    }
}
