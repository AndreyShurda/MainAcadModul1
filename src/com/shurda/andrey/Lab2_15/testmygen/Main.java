package com.shurda.andrey.Lab2_15.testmygen;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1) Add to class MyNumGenerator new method generateDistinct() which return new collection (of Set type) with numOfElm
 * length and filled with distinct (with no duplicate values) numbers (which generated randomly) from 0 to  maxNumb.
 * 2) Create a class Main with a main() method. Add to method main() code to create instance of MyNumGenerator
 * (for example with 5,64 parameters) and print result of invoking generateDistinct() method to console. 
 * 3) Execute the program. The program output must be like next example: [5,61,47,2,17]
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);

        List<Number> numberList = myNumGenerator.generate();
        System.out.println(Arrays.toString(numberList.toArray()));

        Set<Number> set = myNumGenerator.generateDistinct();
        System.out.println(Arrays.toString(set.toArray()));

    }
}
