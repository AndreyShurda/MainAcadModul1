package com.shurda.andrey.se.Lab1_7.tetslambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1) Create a class Main with a main() method, which creates array of Integer type and fills it
 * with random values. Add in a main() method of the sorting code an array of integer values in
 * descending order, using lambda expressions to specify the sort order.
 * 2) Add in a main() method code that creates a list of strings and sorts  it in the reverse
 * alphabetical order. Using lambda expressions to specify the sort order.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Array before sort");
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Array after sort");
        Arrays.sort(array, ((o1, o2) -> o2 - o1));
        System.out.println(Arrays.toString(array));


        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("hay");
        list.add("world");
        list.add("list");
        list.add("string");
        list.add("South");

        System.out.println("List before sort");
        System.out.println(list);
        System.out.println();

        System.out.println("Array after sort");
        list.sort((o1, o2) -> o2.compareToIgnoreCase(o1));
        System.out.println(list);
    }
}

