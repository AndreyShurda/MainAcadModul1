package com.shurda.andrey.Lab2_7.oop.testshapes;

import java.util.Arrays;

public class UseInterface {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red", 11, 22);
        Shape triangle = new Triangle("black", 5, 5, 5);
        Shape circle = new Circle("Green", 10);

        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle;
        shapes[1] = triangle;
        shapes[2] = circle;

        printAllShapes(shapes);

        Shape rectangle2 = new Rectangle("red", 1, 22);
        Shape rectangle3 = new Rectangle("red", 11, 22);
        System.out.println(rectangle2.compareTo(rectangle3));

        System.out.println("Lab2-8-4");
        Shape[] rectangles = new Rectangle[6];
        rectangles[0] = new Rectangle("red", 11, 22);
        rectangles[1] = new Rectangle("black", 1, 2);
        rectangles[2] = new Rectangle("yellow", 8, 12);
        rectangles[3] = new Rectangle("white", 5, 30);
        rectangles[4] = new Rectangle("green", 11, 18);
        rectangles[5] = new Rectangle("red", 20, 22);

        System.out.println("Before sort");
        printAllShapes(rectangles);
        System.out.println();
        System.out.println("After sort");
        Arrays.sort(rectangles);
        printAllShapes(rectangles);

        System.out.println();
        System.out.println("After multiple sort");
        Arrays.sort(rectangles, new ShapeCompare());
        printAllShapes(rectangles);
    }

    public static void printAllShapes(Drawable[] obj){
        for (Drawable drawable : obj) {
            drawable.draw();
        }
    }
}
