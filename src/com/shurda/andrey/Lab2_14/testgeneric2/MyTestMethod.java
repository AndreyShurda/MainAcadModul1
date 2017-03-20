package com.shurda.andrey.Lab2_14.testgeneric2;

import java.util.Arrays;
import java.util.Comparator;

public class MyTestMethod {

    static <T extends Comparable<T>> void calcNum(T[] array, T maxElem) {
        int countOfGreateElements = 0;
        Arrays.sort(array);
        System.out.println("Array values: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(maxElem) == 1) {
                countOfGreateElements++;
            }
        }
        System.out.println("Number of elements that are greater than " + maxElem + ":");
        System.out.println(countOfGreateElements);
    }

    static <T extends Number & Comparable<T>> void calcSum(T[] array, T maxValue) {
        Double sum = 0.0;
        Arrays.sort(array);
        System.out.println("Array values: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(maxValue) == 1) {
                sum = sum + array[i].doubleValue();
            }
        }

        System.out.println("Sum of elements that are greater than " + maxValue + ":");
        System.out.println(sum);
    }

}
