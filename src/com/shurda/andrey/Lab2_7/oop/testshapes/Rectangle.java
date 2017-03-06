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

    public static Rectangle parseRectangle(String stringShape) {
        String[] arrayShape = stringShape.split(":");
        Rectangle shape = null;
        if (arrayShape.length == 3) {
            String parameters = arrayShape[2];
            String[] arrayParameters = parameters.split(",");
            if (arrayParameters.length == 2)
                shape = new Rectangle(arrayShape[1], Double.parseDouble(arrayParameters[0]), Double.parseDouble(arrayParameters[1]));
            else
                System.out.println("Not a Rectangle");
        } else
            System.out.println("This string can't convert to a Rectangle");

        return shape;
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

}
