package com.shurda.andrey.Lab1_6;

import java.util.Arrays;

/**
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30)
 * and display elements of the array to the screen.
 */
public class Lab1_6_1 {
    public static void main(String[] args) {
        int n = 30;
        int count = 0;
        int[] evenArray = new int[n / 2];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                evenArray[i / 2 - 1] = i;
            }
        }

        for (int anEvenArray : evenArray) {
            System.out.print(anEvenArray + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(evenArray));
    }
}
