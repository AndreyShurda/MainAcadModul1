package com.shurda.andrey.Lab2_7.oop.testshapes;

import java.util.Objects;
import java.util.Random;

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
 * <p>
 * Use MyShapes project. The program must demonstrate the creation of an array of different types
 * of shapes and print characteristics of each shape on console.
 * 1. Add new code to method main() in class Main:
 * <p>
 * 2. Create array (Shape[] arr) of different Shape objects,
 * (five rectangles, two circles and two triangles);
 * <p>
 * 3. Add code to iterate over shapes array in loop (use for-each loop)
 * and print characteristics of each shape on console (using toString() method)
 * with area of this shape (using calcArea() method).
 * <p>
 * 4. Execute the program, output must looks like:
 * This is Rectangle, color: RED, width=11, height=22, area is: 242
 * This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
 * This is Circle, color: GREEN, radius=10, area is: 314.15926 …
 * <p>
 * 5. Add code to calculate total area of all shape types.
 * Define sumArea (of double type) local variable and use it in loop to sum total area for all shapes.
 * <p>
 * 6. Add code to sum total area for each shape types.
 * Define sumRectArea, sumTriangleArea, sumCircleArea (of double type)
 * local variables and use it in loop to sum total area for each shape type.
 * You should use instanceof keyword for determining,
 * total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.
 * <p>
 * 7. Execute the program, output must looks like:
 * Rectangles total area: 234.54
 * Circle total area: 547.231
 * Triangle total area: 356.56
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
        circle.printArea(circle.calcArea());
        System.out.println();

        Shape rectangle = new Rectangle("red", 11, 22);
        System.out.println(rectangle);
        rectangle.printArea(rectangle.calcArea());
        System.out.println();

        Shape triangle = new Triangle("black", 5, 5, 5);
        System.out.println(triangle);
        triangle.printArea(triangle.calcArea());

        System.out.println("==========LAB 2-7-10 =========");

        Shape[] shapes = new Shape[9];

        Random r = new Random();
        for (int i = 0; i < shapes.length; i++) {
            if (i < 5) {
                shapes[i] = new Rectangle("red", i + 1 * 10, 10 - i);
            } else if (i < 7) {
                shapes[i] = new Triangle("black", i + 1 * 10, 10 - i, i + 1 * 10);
            } else if (i < 9) {
                shapes[i] = new Circle("green", i);
            }
        }

        printAllShapes(shapes);
        System.out.println();

        System.out.println("Rectangles total area:" + Rectangle.sumRectangleArea(shapes));
        System.out.println("Circles total area:" + Circle.sumCircleArea(shapes));
        System.out.println("Triangle total area:" + Triangle.sumTriangleArea(shapes));

    }


    public static void printAllShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.print(shape + ", area is: ");
            System.out.format("%.2f%n", shape.calcArea());
        }
    }

}
