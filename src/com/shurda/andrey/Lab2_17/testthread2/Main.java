package com.shurda.andrey.Lab2_17.testthread2;

import java.util.Arrays;
import java.util.Random;

/**
 * Create new project called  TestThread2. Add package “com.brainacad.oop.testthread2”.
 * 1. Create a class MySumCount which extends the Thread class. Add to class  MySumCount  two integer fields
 * startIndex and stopIndex with setters and getters. Add to class  MySumCount  new field as array of integer type and setter for it.
 * Add to class  MySumCount  new field resultSum of long type and getter for it.
 * 2. Override the run() method of Thread. Add code to calculate sum of array elements from startIndex to stopIndex and
 * save result to resultSum field.
 * 3. Create a class Main with a main() method. Add to method main() code that declares local variable myArray as array of integer type
 * (of 1000 size), and create two instances of MySumCount.  Add code to fill all elements of myArray with random integer
 * values generated from 0 to 1000 range. Add code to calculates sum of myArray elements in two separate thread and then print
 * result to console.
 * 4. Execute the program. The program output must be like next example:
 * [324,234,523,…,643]
 * Sum of array elements: 123457
 */
public class Main {
    public static void main(String[] args) {
        int len = 1000;
        int[] myArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(len);
        }

        MySumCount sumCount1 = new MySumCount();
        sumCount1.setArray(myArray);
        sumCount1.setStartIndex(0);
        sumCount1.setStopIndex(myArray.length / 2);

        MySumCount sumCount2 = new MySumCount();
        sumCount2.setArray(myArray);
        sumCount2.setStartIndex(myArray.length / 2);
        sumCount2.setStopIndex(myArray.length);

        sumCount1.start();
        sumCount2.start();
        try {
            sumCount1.join();
            sumCount2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long sum = sumCount2.getResultSum() + sumCount1.getResultSum();

        System.out.println(Arrays.toString(myArray));

//        long sumArr = 0;
//        for (int item : myArray) {
//            sumArr += item;
//        }
//        System.out.println("Sum of array elements arr: " + sumArr);
        System.out.println("Sum of array elements: " + sum);
    }
}
