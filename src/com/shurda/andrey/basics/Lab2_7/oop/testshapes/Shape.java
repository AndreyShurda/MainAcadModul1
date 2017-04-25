package com.shurda.andrey.basics.Lab2_7.oop.testshapes;


public abstract class Shape implements Drawable, Comparable<Shape> {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    protected void printArea(double area) {
        System.out.print("Shape area is: ");
        System.out.format("%.3f%n", area);
    }

    public static Shape parseShape(String stringShape) throws InvalidShapeStringException {
        String[] arrayShape = stringShape.split(":");
        Shape shape = null;
        if (arrayShape.length == 3) {
            switch (arrayShape[0]) {
                case "Rectangle":
                    shape = Rectangle.parseRectangle(stringShape);
                    break;
                case "Triangle":
                    shape = Triangle.parseTriangle(stringShape);
                    break;
                case "Circle":
                    shape = Circle.parseCircle(stringShape);
                    break;
                default:
                    System.out.println("Not a shape");
            }
        } else
//            System.out.println("This string can't convert to a shape");
            throw new InvalidShapeStringException("This string can't convert to a shape");

        return shape;
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
