package com.shurda.andrey.Lab2_3;

/**
 * 1) Create class MyWindow with fields
 * width (of double type),
 * height (of double type),
 * numberOfGlass(of int type),
 * color(of  String type),
 * isOpen(boolean).
 * 2) Create five instances of class MyWindow  with different  fields values.
 * 3) Add method printFields()  to  MyWindow class  that print all fields values to console.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public void printFields(){
        System.out.println(toString());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
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
