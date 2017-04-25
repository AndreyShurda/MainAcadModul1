package com.shurda.andrey.basics.Lab2_7.oop.testshapes;

import java.util.Arrays;

import static com.shurda.andrey.Util.Labs.*;

public class UseInterface {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red", 11, 22);
        Shape triangle = new Triangle("black", 5, 5, 5);
        Shape circle = new Circle("Green", 10);

        Shape[] shapes = new Shape[0];
        shapes = addElements(shapes, rectangle);
        shapes = addElements(shapes, triangle);
        shapes = addElements(shapes, circle);

        printAllShapes(shapes);

        Shape rectangle2 = new Rectangle("red", 1, 22);
        Shape rectangle3 = new Rectangle("red", 11, 22);
        System.out.println(rectangle2.compareTo(rectangle3));

        System.out.println("Lab2-8-4");

        Shape[] rectangles = new Rectangle[0];
        rectangles = addElements(rectangles, new Rectangle("red", 11, 22));
        rectangles = addElements(rectangles, new Rectangle("black", 1, 2));
        rectangles = addElements(rectangles, new Rectangle("yellow", 8, 12));
        rectangles = addElements(rectangles, new Rectangle("white", 5, 30));
        rectangles = addElements(rectangles, new Rectangle("green", 11, 18));
        rectangles = addElements(rectangles, new Rectangle("red", 20, 22));

        System.out.println("Before sort");
        printAllShapes(rectangles);
        System.out.println();
        System.out.println("After sort");
        Arrays.sort(rectangles);
        printAllShapes(rectangles);

        System.out.println("Lab2-8-5");
        Shape[] shapesCompare = new Shape[0];

        for (int i = 0; i < rectangles.length; i++) {
            shapesCompare = addElements(shapesCompare, rectangles[i]);
        }

        for (int i = 0; i < shapes.length; i++) {
            shapesCompare = addElements(shapesCompare, shapes[i]);
        }
        shapesCompare = addElements(shapesCompare, new Circle("white",2));
        printAllShapes(shapesCompare);
        Arrays.sort(shapesCompare);

        System.out.println();
        System.out.println("After multiple sort");
        Arrays.sort(shapesCompare, new ShapeCompare());
        printAllShapes(shapesCompare);

    }

    public static void printAllShapes(Drawable[] obj) {
        for (Drawable drawable : obj) {
            drawable.draw();
        }
    }
}
