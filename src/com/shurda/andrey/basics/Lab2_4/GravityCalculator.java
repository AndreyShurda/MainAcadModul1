package com.shurda.andrey.basics.Lab2_4;

/**
 * Write a program that computes the distance an object will fall in Earth's gravity.
 * Create a new class called GravityCalculator with method calcDist(double time)
 * that takes double  time, and returns the position of an object
 * after falling for time  seconds (outputting the position in meters).
 * The formula in Math notation is:
 * x(t) = 0.5 × a × time 2 + vi × time + xi
 * Where:
 * a - Acceleration (m/s2 ) = -9.81
 * t - Time (s) (for example t = 10)
 * vi - Initial velocity (m/s) = 0
 * xi - Initial position = 0
 * Declare acceleration value field as a constant;
 */
public class GravityCalculator {
    private static final double ACCELERATION = 9.81;


    public static double calcDist(double time, double x, double v) {
        double t = (0.5 * time * time * ACCELERATION) + v * time + x;
        System.out.println("The distance an object is fall " + t +" meters");
        return t;
    }

    public static void main(String[] args) {
        GravityCalculator.calcDist(10, 10, 10);
        GravityCalculator.calcDist(100, 0, 0);
    }
}
