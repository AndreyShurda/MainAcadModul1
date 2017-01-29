package com.shurda.andrey.Lab2_2;

/**
 * Write class Accountant that will be create Employee instance and
 * use his method with a different number of data.
 */
public class Employee {

    public static void calcSalary(String name, double... a) {
        double total = 0.0;
        for (double v : a) {
            total += v;
        }

        System.out.println("Name of employee " + name + " his total salary is: " + total);
        ;
    }

}
