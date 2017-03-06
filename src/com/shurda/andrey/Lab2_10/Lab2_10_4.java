package com.shurda.andrey.Lab2_10;

import com.shurda.andrey.Lab2_7.oop.testshapes.Circle;
import com.shurda.andrey.Lab2_7.oop.testshapes.Rectangle;
import com.shurda.andrey.Lab2_7.oop.testshapes.Triangle;

/**
 * Rewrite the Rectangle class to add new public static method called parseRectangle (String)
 * which returns new object as Rectangle type based on string passed as argument.
 * Example of possible strings:
 * “Rectangle:RED:5,6”;
 * “Rectangle:RED:10,20”;
 * “Rectangle:RED:33,44”;
 * In parseRectangle() method you must determine and extract numeric values form string
 * and parse it to double type (using Double.parseDouble() method),
 * to use it as arguments to create Rectangle object and pass it to return statement;
 * Provide the same changes (add parse…() method) in Triangle and Circle classes.
 * Rewrite the Shape.parseShape(String) method in Shape class to use invocation of particular parse…() method
 * for each shape object type (in switch statement).
 * For example:  Rectangle.parseRectangle (String) method to parse string in case of Rectangle object.
 */
public class Lab2_10_4 {
    public static void main(String[] args) {
        System.out.println(Rectangle.parseRectangle("Rectangle:RED:5,6"));
        System.out.println(Rectangle.parseRectangle("Rectangle:RED:10,20"));
        System.out.println(Rectangle.parseRectangle("Rectangle:RED:33,44"));
        Rectangle.parseRectangle("Rectangle:RED:33,44,2,3");
        System.out.println(Triangle.parseTriangle("Triangle:RED:33,44,23"));
        System.out.println(Circle.parseCircle("Circle:BLACK:10"));
    }
}
