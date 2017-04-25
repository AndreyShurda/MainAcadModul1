package com.shurda.andrey.basics.Lab1_5;

import java.util.Scanner;

/**
 * Write a program that calculates and displays the sum of squares of digits of number.
 */
public class Lab1_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number;
        int sumSqrt = 0;

        for (int i = 0; i < line.length(); i++) {
            number = Integer.valueOf(line.substring(i, i + 1));
            sumSqrt += Math.pow(number, 2);
            //System.out.println(number);
        }
        System.out.println("The sum is: " + sumSqrt + " of number: " + line);
    }
}
