package com.shurda.andrey.Lab2_7.oop.testshapes;

/**
 * Created by admin on 13.02.2017.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        printArea(0.0);
        return 0.0;
    }

    protected void printArea(double area){
        System.out.println("Shape area is: " + area);
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color is: " + shapeColor.toUpperCase();
    }
}
