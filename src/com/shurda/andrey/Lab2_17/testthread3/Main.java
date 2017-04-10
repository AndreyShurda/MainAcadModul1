package com.shurda.andrey.Lab2_17.testthread3;

/**
 * Create new project called  TestThread3. Add package “com.brainacad.oop.testthread3”.
 * 1. Write a program in which one thread increments an integer 1,000,000 times, and a second thread prints
 * the integer (without waiting for it to finish).
 * 2. Implement three classes: Storage, Counter, and Printer. The Storage class should store an integer.
 * The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and stores each
 * value in the Storage class.
 * The Printer class should create a thread that keeps reading the value in the Storage class and printing it.
 * 3. Write a program that creates an instance of the Storage class and sets up a Counter and a Printer object
 * to operate on it. 
 * 4. Now modify the program to use a condition variable to signal completion of the addition task by the first
 * thread before the second thread prints the value (using Wait/Notify Mechanism).
 * 5. Execute the program. The program output must be like next example: 0 1 2 3 … 999999
 */
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        long valueCount = 100;
        Counter counter = new Counter(storage, valueCount);
        counter.start();

        Printer printer = new Printer(storage, valueCount);
        printer.start();
    }

}
