package com.shurda.andrey.Lab1_5;

import java.util.Scanner;

/**
 * Write a program that find and displays all perfect numbers from 1 to n
 * (perfect number is a positive integer that is equal to the sum of its proper positive divisors,
 * excluding the number itself).
 */
public class Lab1_5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        boolean isInt;
        long n = 0;
        do {
            System.out.print("Enter nuber:");
            isInt = scanner.hasNextInt();
            line = scanner.nextLine();
            if (!isInt) {
                System.out.println("It's not a number. Please enter an integer number");
            } else {
                if (n <= 0)
                    System.out.println("Enter positive number");
                else
                    n = Integer.valueOf(line);
            }
        } while (!isInt || n <= 0);

        long sum;
        for (long i = 1; i < n; i++) {
            sum = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0 && j != 1) {
                    sum = sum + i / j;
                    //System.out.println("sum["+i+","+j+"]="+sum+" i/j = "+i/j);
                }
            }
            if (sum == i) {
                System.out.println("The perfect number is: " + sum);
            }
            //System.out.println();
        }
    }
}
