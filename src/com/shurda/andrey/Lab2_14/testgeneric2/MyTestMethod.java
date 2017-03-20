package com.shurda.andrey.Lab2_14.testgeneric2;

import java.util.Arrays;

/**
 * Add package “com.brainacad.oop.testgenerics2”.
 * 1) Create class MyTestMethod with generic static method calcNum (with two parameters: an array T[]
 * and variable maxElem of type T) that counts the number of elements in an array T[] that are greater
 * than a specified element maxElem.
 * 2) Create a class Main with a main() method. Add to method main() code that creates two array,
 * first – array of Integer type and second – array of Double type. Fill these arrays with some random values.
 * Add code to counts the number of elements in each of arrays that are greater than a specified element
 * by invoking calcNum() static method.
 * 3) Execute the program.
 * The program output must be like next example:
 * Array values: [1,2,3,4,5,6,7,8,9]
 * Number of elements that are greater than 3:
 * 6
 * Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 * Number of elements that are greater than 3:
 * 7
 */
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

}
