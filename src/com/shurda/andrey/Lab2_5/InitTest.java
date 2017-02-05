package com.shurda.andrey.Lab2_5;

/**
 * Write class InitTest with private field id of int type and static private field nextId of integer.
 * Write code that:
 * Initialize static field nextId of some random value (in 1 … 1000 range) once when class loaded to JVM;
 * Increments  static field nextId each time when new instance of InitTest created;
 * Initialize field id of nextId field value each time when new instance of InitTest created.
 * And method getId() which will return value of id.
 * Create class Main, which will create five instances of class
 * InitTest and invokes method getId() on each instance and print returned value on console.
 */
public class InitTest {
    private int id = nextId;
    private static int nextId = (int) (100 * Math.random());

    public InitTest() {
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        InitTest[] initTest = new InitTest[5];
        for (int i = 0; i < initTest.length; i++) {
            initTest[i] = new InitTest();
            System.out.println("Id of InitTest is " + initTest[i].getId());
        }
    }
}
