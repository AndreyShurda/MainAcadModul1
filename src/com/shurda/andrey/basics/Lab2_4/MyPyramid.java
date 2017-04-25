package com.shurda.andrey.basics.Lab2_4;

/**
 * Write a class MyPyramid with public static method printPyramid(int h)
 * that takes parameter an integer h between 1 and 9,
 * and prints a pyramid of numbers of height h.
 * Example: For h = 4 the method should print the pyramid
 *    1
 *   121
 *  12321
 * 1234321
 */
public class MyPyramid {
    public static void printPyramid(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = h - 1; j >= 0; j--) {
                if (j < i)
                    System.out.print(i - j);
                else
                    System.out.print(" ");
            }

            for (int j = 1; j <= h; j++) {
                if (j < i)
                    System.out.print(i - j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(8);
    }
}
