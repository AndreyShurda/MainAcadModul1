package com.shurda.andrey.basics.Lab1_6;

import java.util.Arrays;

/**
 * Writing simple console application, using  2-dimensional arrays.
 * Write a program, which creates square matrix like those
 * in the figure below and prints them formatted to the console.
 * The size of the matrix is 4 x 4:
 */
public class Lab1_6_3 {
    public static void main(String[] args) {
        int n = 4;
        int[][] dimArray = new int[n][n];

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray.length; j++) {
                //System.out.print(i+j*4+" ");
                dimArray[i][j] = i + 1 + j * 4;
            }
            //System.out.println();
        }

        for (int[] ar : dimArray) {
            System.out.println(Arrays.toString(ar));
        }

    }
}
