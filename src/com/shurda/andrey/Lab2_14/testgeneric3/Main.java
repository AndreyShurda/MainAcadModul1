package com.shurda.andrey.Lab2_14.testgeneric3;

import java.util.Arrays;
import java.util.Random;

/**
 * Add package “com.brainacad.oop.testgenerics3”.
 * 1) Create a generic class MyMixer<T> with field as array of some type, provide constructor with one parameters.
 * Add to MyMixer public shuffle() method which shuffle elements of array and return it;
 * 2) Create a class Main with a main() method. Add to method main() code that creates two array of different types:
 * First one is array of Integer with values {1,2,3,4,5,6,7,8,9}
 * Second one is array of String: {“one”,”two”, …}
 * 3) Create two objects of MyMixer type and using each of arrays, invoke shuffle() method and print result to console.
 * 4) Execute the program.
 * Example of program output:
 * [6,7,4,3,2,9,1,5,8]
 * [nine,one,two,five,…,]
 */
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Integer[] arrayInteger = new Integer[10];
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = random.nextInt(20);
        }
        MyMixer<Integer> mixerInteger = new MyMixer<>(arrayInteger);
        System.out.println("Array of Integer before shuffle");
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.toString(arrayInteger));

        System.out.println("Array of Integer after shuffle");
        mixerInteger.shuffle();
        System.out.println(Arrays.toString(arrayInteger));

        System.out.println();
        String[] arrayString = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        MyMixer<String> mixerString = new MyMixer<>(arrayString);
        System.out.println("Array of String before shuffle");
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.toString(arrayString));

        System.out.println("Array of String after shuffle");
        mixerString.shuffle();
        System.out.println(Arrays.toString(arrayString));


    }
}
