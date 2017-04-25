package com.shurda.andrey.basics.Lab2_14.testgeneric2;

import java.util.Random;

/**
 * Lab2-14-2
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
 *
 * Lab2-14-3
 * 1) Rewrite a class MyTestMethod to add new generic static method calcSum (with two parameters: an array T[]
 * and variable maxValue of type T) that calc sum of the number of elements in an array T[] that are greater
 * than a specified value maxValue.
 * 2) Add to method main() code that creates two array, first – array of Integer type and second – array of Double type.
 * Fill these arrays with some random values.
 * Add code to counts the total sum of elements in each of arrays,  that are greater than a specified element
 * by invoking calcSum() static method.
 * 3) Execute the program.
 * The program output must be like next example:
 * Array values: [1,2,3,4,5,6,7,8,9]
 * Sum of elements that are greater than 3:
 * 39
 * Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 * Sum of elements that are greater than 3:
 * 46.2
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========Lab2_14_2==============");
        Random random = new Random();
        Integer[] arrayInteger = new Integer[10];
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = random.nextInt(20);
        }
        int maxIntegerElem = 8;
        MyTestMethod.calcNum(arrayInteger, maxIntegerElem);

        Double[] arrayDouble = new Double[10];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = random.nextInt(20) * 1.11;
        }
        double maxDoubleElem = 5.5;
        MyTestMethod.calcNum(arrayDouble, maxDoubleElem);

        System.out.println();
        System.out.println("==========Lab2_14_3==============");
        MyTestMethod.calcSum(arrayInteger,maxIntegerElem);
        System.out.println();
        MyTestMethod.calcSum(arrayDouble,maxDoubleElem);
    }
}
