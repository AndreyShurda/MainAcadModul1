package com.shurda.andrey.Lab2_7.oop.testshapes;


import java.util.Comparator;

public abstract class Shape implements Drawable, Comparable<Shape>{
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    protected void printArea(double area){
        System.out.print("Shape area is: ");
        System.out.format("%.3f%n", area);
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color is: " + shapeColor.toUpperCase();
    }

    @Override
    public int compareTo(Shape shape) {
//        Shape shape = (Shape) o;
        if (this.calcArea() > shape.calcArea()) {
            return 1;
        }
        if (this.calcArea() < shape.calcArea()) {
            return -1;
        }

        return 0;
    }
}
