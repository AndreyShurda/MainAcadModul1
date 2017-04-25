package com.shurda.andrey.basics.Lab2_4;

/**
 * The value of π can be calculated with the series:
 * π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 * Write a class MyCalc with public static method calcPi(int)
 * that takes as parameter an integer n, and computes and returns
 * the value of π approximated to the first n terms of the series.
 */
public class MyCalc {
    public static double calcPi(int n) {
        double pi = 0;
        int count = 0;
        for (int i = 1; i < n * 2; i += 2) {
            if (count % 2 == 0)
                pi += (double) 4 / i;
            else
                pi -= (double) 4 / i;

            count++;
        }

        return pi;
    }

    public static void main(String[] args) {
        System.out.println(MyCalc.calcPi(1000));
    }
}
