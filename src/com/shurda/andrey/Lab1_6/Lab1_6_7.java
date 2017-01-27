package com.shurda.andrey.Lab1_6;

import java.util.Arrays;

/**
 * Write a program, which finds in a given matrix the area of equal numbers.
 * Here is one example with an area containing 7 elements with equal value of 1:.
 */
public class Lab1_6_7 {
    public static void main(String[] args) {
        int[][] ar = {{1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}};

        int[] resultAr = new int[3];
        for (int i = 0; i < ar.length; i++) {
            Arrays.fill(resultAr, -1);
            int count = 0;
            int indexFirst = 0;
            int indexLast = 0;
            System.out.print("Line " + (i + 1) + ": [ ");
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 1) {
                    resultAr[count] = j;
                    count++;
                    System.out.print(j + " ");
                }
            }
            System.out.println("]");
        }
    }
}
