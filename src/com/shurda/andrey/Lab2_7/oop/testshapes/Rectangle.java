package com.shurda.andrey.Lab2_7.oop.testshapes;

/**
 * Add to project  MyShapes a new class Rectangle which is a subclass of Shape.
 * Add to class Rectangle a private field’s width and height (of double type).
 * In class Rectangle override  calcArea() method which must return area of rectangle
 * (By the formula:  area  = width* height).
 * In class Rectangle override the toString() method. It must return string which contain name of shape, color and rectangle width and height. Example:
 * “This is Rectangle, color: RED, width=11, height=22”
 * Add to class Rectangle constructor with color, width and height arguments.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = getHeight() * getWidth();
//        printArea(area);
        return area;
    }


    public static double sumRectangleArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                sum += shape.calcArea();
            }
        }
        return sum;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", height=" + height;
    }

    @Override
    public void draw() {
        System.out.println(toString() + " area is " + calcArea());
    }

//    @Override
//    public int compareTo(Object o) {
//        Rectangle rectangle = (Rectangle) o;
//        if (this.calcArea() > rectangle.calcArea()) {
//            return 1;
//        }
//        if (this.calcArea() < rectangle.calcArea()) {
//            return -1;
//        }
//
//        return 0;
//    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        Rectangle rect = (Rectangle) o1;
//        Rectangle rect2 = (Rectangle) o2;
//        if (rect)
//        return 0;
//    }
}
