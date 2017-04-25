package com.shurda.andrey.basics.Lab2_7.oop.testshapes;

import java.util.Comparator;

public class ShapeCompare implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape = (Shape) o1;
        Shape shape1 = (Shape) o2;
        String shapeColor = shape.getShapeColor();
        String shapeColor2 = shape1.getShapeColor();

        return shapeColor.compareToIgnoreCase(shapeColor2);
    }
}
