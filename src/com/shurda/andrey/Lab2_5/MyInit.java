package com.shurda.andrey.Lab2_5;

/**
 * Create class MyInit with field arr of array of integers and
 * non-static initialization block which will initialize
 * that array with random values (Size of array is 10).
 * To generate random numbers you can use next code:
 * arr[i]= (int) (100 * Math.random()).
 * (Or using Random class instance and nextInt() method invocation).
 * Add to class MyInit and method printArray() which will print values of this array.
 * Create class Main, which will create two instances of class MyInit and
 * invoke method printArray() to print values of their arrays on console.
 * <p>
 * Example of output:
 * 23,43,11,34,78,59,34,61,24,2
 * 5,48,50,3,1,4,67,62,78,98
 */
public class MyInit {
    private static int[] arr;

    {
        System.out.println("Initialisation array");
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public void printArray() {
        System.out.println("Array elements");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();
        System.out.println("First Array");
        myInit1.printArray();

        System.out.println();

        System.out.println("Second Array");
        myInit2.printArray();
    }
}
