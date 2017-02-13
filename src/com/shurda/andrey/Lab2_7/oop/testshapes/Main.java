package com.shurda.andrey.Lab2_7.oop.testshapes;

/**
 * Define a Shape class as:
 * public class Shape {
 * //declare private instance variable shapeColor of String type
 * // create a constructor for Shape with shapeColor parameter
 * // Override  toString() to return the string of Shape name and color, example:
 * “Shape, color is: RED”
 * // All shapes must has a method called calcArea(), write public method (empty)
 * calcArea() that returns double value ( 0.0 ) .
 * }
 * Create class Main with method main().
 * The program must demonstrate the creation of one Shape object and print it
 * name and color to console. Then add code to invoke calcArea() method and print result to console.
 * Program output must looks like:
 * “This is Shape, color is: RED”
 * “Shape area is: 0”
 * <p>
 * Then add to class Main code to create one Circle object and print it name color, and radius to console. Then invoke calcArea() method and print result to console.
 * Program output must looks like:
 * “This is Circle, color: GREEN, radius=10”
 * “Shape area is: 314.15926”
 * <p>
 * Then add to class Main code to create one Rectangle object and print it name,
 * color, width and height to console.
 * Then invoke calcArea() method and print result to console
 * <p>
 * 2) Then add to class Main code to create one Triangle object and print it name,
 * color, a, b, c sides of triangle to console. Then invoke calcArea() method
 * and print result to console.
 * Program output must looks like:
 * “This is Triangle, color: BLACK, a=5, b=5, c=5” “Shape area is: 10.825”
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red");
        System.out.println(shape);
        shape.calcArea();
        System.out.println();

        Shape shapeCircle = new Circle("Green", 22);
        System.out.println(shapeCircle);
        System.out.println();

        Shape circle = new Circle("Green", 10);
        System.out.println(circle);
        circle.calcArea();
        System.out.println();

        Shape rectangle = new Rectangle("red", 11, 22);
        System.out.println(rectangle);
        rectangle.calcArea();
        System.out.println();

        Shape triangle = new Triangle("black", 5, 5, 5);
        System.out.println(triangle);
        triangle.calcArea();
    }
}
