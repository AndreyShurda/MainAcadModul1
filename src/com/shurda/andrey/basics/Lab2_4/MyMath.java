package com.shurda.andrey.basics.Lab2_4;

public class MyMath {
    final static double PI = 3.14;

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static double areaOfCircle(double radius){
        return PI*radius*radius;
    }
}
