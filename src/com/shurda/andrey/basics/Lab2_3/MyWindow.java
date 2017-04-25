package com.shurda.andrey.basics.Lab2_3;

/**
 * 1) Create class MyWindow with fields
 * width (of double type),
 * height (of double type),
 * numberOfGlass(of int type),
 * color(of  String type),
 * isOpen(boolean).
 * 2) Create five instances of class MyWindow  with different  fields values.
 * 3) Add method printFields()  to  MyWindow class  that print all fields values to console.
 * Lab2-3-2
 * <p>
 * 1) Add to class MyWindow constructor without parameters,
 * which will initialize class’s fields by some default values.
 * 2) Create instance of class MyWindow using constructor without parameters
 * <p>
 * Lab2-3-3
 * Add to class MyWindow overload constructors,
 * which will initialize class’ fields,
 * depend from what data we will put there:
 * MyWindow(width, height),
 * MyWindow(width, height, numberOfGlass).
 * Finally class MyWindow must have four constructors
 * <p>
 * Lab2-3-4
 * Change code in two overloaded constructors to invoke first constructor using this keyword
 */
public class MyWindow {
    private double width = 300.0;
    private double height = 250.0;
    private int numberOfGlass = 2;
    private String color = "red";
    private boolean isOpen = true;

    public MyWindow() {
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass);
        this.color = color;
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.println(toString());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public int getNumberOfGlass() {
        return numberOfGlass;
    }


    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }


    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", numberOfGlass=" + getNumberOfGlass() +
                ", color='" + getColor() + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
