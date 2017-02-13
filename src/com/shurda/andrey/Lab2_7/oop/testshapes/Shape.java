package com.shurda.andrey.Lab2_7.oop.testshapes;


public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

    protected void printArea(double area){
        System.out.print("Shape area is: ");
        System.out.format("%.3f%n", area);
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color is: " + shapeColor.toUpperCase();
    }
}
