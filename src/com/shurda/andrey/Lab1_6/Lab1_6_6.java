package com.shurda.andrey.Lab1_6;

import java.util.Arrays;

/**
 * Write a program that sorts an array of average temperature values by months
 * of 2015 as follows: at first the negative values, then - positive values.
 */
public class Lab1_6_6 {
    public static void main(String[] args) {
        int[] tempAvgManth = {-2, 0, 5, 13, 20, 23, 26, 24, 19, 11, 5, 30};

        System.out.println("Array temperature of months: " + Arrays.toString(tempAvgManth));
        for (int i = 0; i < tempAvgManth.length / 2; i++) {
            int min = tempAvgManth[i];
            int max = tempAvgManth[i];
            int indexMin = i;
            int indexMax = i;
            for (int j = i; j < tempAvgManth.length - i; j++) {
                if (tempAvgManth[j] > max) {
                    max = tempAvgManth[j];
                    indexMax = j;
                }

                if (tempAvgManth[j] < min) {
                    min = tempAvgManth[j];
                    indexMin = j;
                }
            }

            if (indexMax != tempAvgManth.length - i - 1) {
                tempAvgManth[indexMax] = tempAvgManth[tempAvgManth.length - i - 1];
                tempAvgManth[tempAvgManth.length - i - 1] = max;
            }

            if (indexMin != i) {
                tempAvgManth[indexMin] = tempAvgManth[i];
                tempAvgManth[i] = min;
            }
        }

        System.out.println("Sort array temperature of months:" + Arrays.toString(tempAvgManth));
    }


}
