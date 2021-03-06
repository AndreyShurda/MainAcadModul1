package com.shurda.andrey.basics.Lab2_11;

/**
 * Create a class Main with a main() that throws an object of class Exception inside a try block.
 * Give the constructor for Exception a String argument.
 * Catch the exception inside a catch clause and print the String argument.
 * Add a finally clause and print a message to prove you were there.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Test Exception");
        } catch (Exception e) {
            System.out.println("catch block");
            System.out.println("This is exception: " + e.getMessage());
        } finally {
            System.out.println("finally block");
        }
    }
}
