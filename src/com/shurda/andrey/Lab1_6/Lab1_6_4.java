package com.shurda.andrey.Lab1_6;

import java.util.Arrays;

/**
 * Write a program, which uses a binary search in a sorted array of integer numbers
 * to find a certain element.
 */
public class Lab1_6_4 {
    public static void main(String[] args) {
        int[] m = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.binarySearch(m, 23));
    }
}
