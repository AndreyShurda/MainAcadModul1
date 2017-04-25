package com.shurda.andrey.basics.Lab2_17.testforkjoin;

/**
 * Create new project called  TestForkJoin. Add package “com.brainacad.oop.testforkjoin”.
 * 1) Create a program to calculate sum all the elements of an array (of 1000000 integer elements, which values generated
 * randomly form 0 to 100),using ForkJoin framework.
 * 2) Create a RecursiveTask for dividing the array into two parts and assign each part to another RecursiveTask for further dividing.
 * Continue dividing the array and stop dividing when the array has less than 20 elements. 
 * Execute the program.
 */

public class Main {
    public static int len = 1_000_000;
    public static int[] array = new int[len];

    public static void main(String[] args) {

        long local_sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            local_sum +=array[i];
        }

        System.out.println("Fork/Join API sum array of elements "+array.length+" is: "+SumTask.sumArray(array));
        System.out.println("Sum array of elements "+array.length+" is: "+SumTask.sumArray(array));
    }
}
