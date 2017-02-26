package com.shurda.andrey.Lab2_7.oop.testshapes;

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

//    @Override
//    public int compareTo(Object o) {
//        Circle circle = (Circle) o;
//        if (this.calcArea() > circle.calcArea()) {
//            return 1;
//        }
//        if (this.calcArea() < circle.calcArea()) {
//            return -1;
//        }
//
//        return 0;
//    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
}
