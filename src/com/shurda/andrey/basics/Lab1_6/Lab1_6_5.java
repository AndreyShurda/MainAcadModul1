package com.shurda.andrey.basics.Lab1_6;

import java.util.Arrays;

/**
 * Write a program, which transpose matrix
 * (2d arrays, size 4x4) and outputs it to the console.
 */
public class Lab1_6_5 {
    public static void main(String[] args) {
        int n = 4;
        int[][] dimArray = new int[n][n];

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                //System.out.print(i+j*4+" ");
                dimArray[i][j] = i + 1 + j * 4;
            }
            //System.out.println();
        }

        for (int[] ar : dimArray) {
            System.out.println(Arrays.toString(ar));
        }

        int[][] transArray = new int[n][n];

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                transArray[i][j] = dimArray[j][i];
            }
        }
        System.out.println("transform array");
        for (int[] ar : transArray) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
