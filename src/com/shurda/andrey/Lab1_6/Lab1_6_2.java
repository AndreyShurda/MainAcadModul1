package com.shurda.andrey.Lab1_6;

/**
 * Writing simple console application,
 * using array and enhanced loop for typical operations on arrays (search).
 * There are statistics for the year by months as an array:
 * int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * Write code which calculates the maximum value from the array,
 * the minimum value and the average
 */
public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        int min = m[0];
        int max = m[0];
        int sum = 0;

        for (int aM : m) {
            if (aM > max) {
                max = aM;
            }

            if (aM < min)
                min = aM;

            sum += aM;
        }

        System.out.println("max = " + max + " min = " + min + " avg = " + sum / m.length);
    }
}
