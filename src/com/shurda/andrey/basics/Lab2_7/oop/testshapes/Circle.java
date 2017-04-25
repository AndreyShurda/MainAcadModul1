package com.shurda.andrey.basics.Lab2_7.oop.testshapes;

/**
 * Add to project  MyShapes a new class Circle which is a subclass of Shape.
 * Add to class Circle a private field radius (of double type).
 * In class Circle override  calcArea() method which must return area of circle
 * (by the formula:  area  = PI*radius2).
 * In class Circle override the toString() method. It must return string which contain
 * name of shape, color and radius of circle. Example:
 * “This is Circle, color: GREEN, radius=22”
 * Add to class Circle constructor with color and radius arguments.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area = Math.PI * getRadius() * getRadius();
//        printArea(area);
        return area;
    }

    public static double sumCircleArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                sum += shape.calcArea();
            }
        }
        return sum;
    }

    public static Circle parseCircle(String stringShape) {
        String[] arrayShape = stringShape.split(":");
        Circle shape = null;
        if (arrayShape.length == 3) {
            String parameters = arrayShape[2];
            String[] arrayParameters = parameters.split(",");
            if (arrayParameters.length == 1)
                shape = new Circle(arrayShape[1], Double.parseDouble(arrayParameters[0]));
            else
                System.out.println("Not a Circle");
        } else
            System.out.println("This string can't convert to a Circle");

        return shape;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + getRadius();
    }

    @Override
    public void draw() {
        System.out.println(toString() + " area is " + calcArea());
    }

}
