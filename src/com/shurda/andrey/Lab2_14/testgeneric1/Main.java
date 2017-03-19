package com.shurda.andrey.Lab2_14.testgeneric1;

/**
 * Add package “com.brainacad.oop.testgenerics1”.
 * 1) Create a generic class MyTuple<A,B,C> with three fields of different types, provide constructor
 * with three parameters and getters for each field.
 * 2) Create a class Main with a main() method. Add to method main() code that creates two objects of MyTuple.
 * The first must be parameterized with next types: String, Integer, Long.
 * The second must be parameterized with next types: Double, String, String. 3) Execute the program.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("MyTuple<A,B,C> is String, Integer, Long");
        MyTuple<String, Integer, Long> myTuple = new MyTuple<>("String", 15, 5000L);
        System.out.println(myTuple);

        System.out.println();
        System.out.println("MyTuple<A,B,C> is Double, String, String");
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(52.12, "FirstString", "SecondString");
        System.out.println(myTuple2);
    }
}
