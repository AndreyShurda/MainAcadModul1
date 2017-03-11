package com.shurda.andrey.Lab2_10;

import com.shurda.andrey.Lab2_7.oop.testshapes.InvalidShapeStringException;
import com.shurda.andrey.Lab2_7.oop.testshapes.Shape;

/**
 * Rewrite the class Shape to add new public static method called parseShape(String)
 * which returns new object as Shape (one of shapes, such as triangle, rectangle and so on)
 * based on string passed as argument. Example of possible strings:
 * “Rectangle:RED:10,20”;
 * “Triangle:GREEN:9,7,12”;
 * “Circle:BLACK:10”.
 * In parseShape() method you must provide following steps:
 * 1. Determine type of shape object (using first word of string and switch statement);
 * 2. Determine and extract numeric values form string and parse it to double type (using Double.parseDouble() method),
 * to use it as arguments to create particular Shape object.
 * 3. Create particular Shape object and pass it to return statement; Add code to main()
 * method in class Main, which creates one Rectangle, one Triangle and one Circle using Shape.parseShape(String) method.

 */
public class Lab2_10_3 {
    public static void main(String[] args) throws InvalidShapeStringException {
        System.out.println(Shape.parseShape("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
        System.out.println(Shape.parseShape("Circle:BLACK:10"));
        System.out.println(Shape.parseShape("Triangles:GREEN:9,7,2"));
        System.out.println(Shape.parseShape("Triangle:GREEN,9"));
    }
}
