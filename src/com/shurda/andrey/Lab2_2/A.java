package com.shurda.andrey.Lab2_2;

/**
 * Write class A with overridden methods calcSquare that calculate square of rectangle,
 * square of foursquare and square of circle and print result.
 * Write class that will use these methods.
 * Write class with method that will take final integer and
 * assign to it the square of this integer and print result. What will you get? Explain result.
 */
public class A {
    public static int calcSquare(int a, int b) {
        System.out.println("Square of rectangle is " + a * b);
        return a * b;
    }

    public static int calcSquare(int a) {
        System.out.println("Square of foursquare is " + a * a);
        return a * a;
    }

    public static void calcSquare(double a) {
        double square = Math.PI * a * a;
        System.out.println("Square of circle is " + a * a);
    }
}
