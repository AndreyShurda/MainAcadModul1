package com.shurda.andrey.basics.Lab1_5;

import java.util.Scanner;

/**
 * Write a program to produce on console the following :
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * 6 5 4 3 2 1
 * 7 6 5 4 3 2 1
 * 8 7 6 5 4 3 2 1
 */
public class Lab1_5_1 {
    public static void main(String[] args) {
        int a = 8;

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i - j);
            }
            System.out.println();
        }
    }
}
