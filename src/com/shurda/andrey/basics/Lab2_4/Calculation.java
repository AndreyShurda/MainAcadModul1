package com.shurda.andrey.basics.Lab2_4;

import java.util.Arrays;

public class Calculation {
    public static void main(String[] args) {
        int[] ar = {2, 8, 3, 9, -1, 8, 10, 6};

        System.out.println(Arrays.toString(ar));
        System.out.println("The minimum element is " + MyMath.findMin(ar));
        System.out.println("The maximum element is " + MyMath.findMax(ar));
        System.out.println("The area of circle is " + MyMath.areaOfCircle(2.5));
    }
}
