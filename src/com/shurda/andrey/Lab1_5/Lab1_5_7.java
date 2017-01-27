package com.shurda.andrey.Lab1_5;

import java.util.Scanner;

/**
 * Write a program that find and displays all perfect numbers from 1 to n
 * (perfect number is a positive integer that is equal to the sum of its proper positive divisors,
 * excluding the number itself).
 */
public class Lab1_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;//= sc.nextLine();

        long n;
        do {
            System.out.print("Enter number n:");
            s = sc.nextLine();
            n = Integer.valueOf(s);
        } while (n < 0);
        int sum;
        for (int i = 1; i < n; i++) {
            sum = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0 && j != 1) {
                    sum = sum + i / j;
                    //System.out.println("sum["+i+","+j+"]="+sum+" i/j = "+i/j);
                }
            }
            if (sum == i) {
                System.out.println("The number is: " + sum);
            }
            //System.out.println();
        }
    }
}
