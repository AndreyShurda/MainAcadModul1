package com.shurda.andrey.Lab2_11.testexcep1;

import com.shurda.andrey.Lab2_7.oop.testshapes.InvalidShapeStringException;
import com.shurda.andrey.Lab2_7.oop.testshapes.Shape;
import java.util.Scanner;
import static com.shurda.andrey.Util.Labs.getPositiveInteger;

/**
 * Create InvalidShapeStringException class  that is subclass of Exception.
 * Rewrite the parseShape(String) method in class Shape to throw  InvalidShapeStringException
 * if string passed as method argument is not valid. Example of valid string:
 * �Rectangle:RED:10,20�; Example of invalid strings:
 * �RectangRED12�;
 * �sdzgdzhgd�;
 * Add code to main() method in class Main, which creates one Rectangle,
 * one Triangle and one Circle using Shape.parseShape(String) method and handles (using try-catch)
 * exceptions if it occurs (display parsing error message on console).
 * Execute program.
 * Add code (in this loop) to read string from console,
 * create new particular shape object (using Shape.parseShape() method)
 * using retrieved string from console and handles exceptions if it occurs.
 */
public class Lab2_11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfShape = getPositiveInteger("of shape");

        int countShape = 0;
        String shape;
        Shape[] shapes = new Shape[numberOfShape];

        while (countShape < numberOfShape) {
            System.out.print("Enter shape" + (countShape + 1) + ":");
            shape = scanner.nextLine();
            try {
                shapes[countShape] = Shape.parseShape(shape);
            } catch (InvalidShapeStringException e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            countShape++;
        }

        printShape(shapes);

    }

    public static void printShape(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            try {
                shapes[i].draw();
            } catch (NullPointerException e) {
                System.out.println("shape" + (i+1) + " method draw() can't call");
            }
        }
    }
}
