package com.shurda.andrey.basics.Lab2_17.testdeadlock1;

/**
 * Add package “com.brainacad.oop.testdeadlock1”.
 * 1) Create a class MyThread which extends Thread class.
 * 2) Create a class MyObject.
 * 3) Create a class Main with a main() method. Provide code which simulates DeadLock using
 * three MyThread objects (threads) and three MyObject objects (used for synchronization).
 * 4) Execute the program several times.  The program output must be like next example:
 * Thread 1: Holding lock 1...
 * Thread 3: Holding lock 3...
 * Thread 2: Holding lock 2...
 * Thread 1: Waiting for lock 2...
 * Thread 3: Waiting for lock 1...
 * Thread 2: Waiting for lock 3...
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = new MyObject();

        MyThread myThread1 = new MyThread(obj1, obj2);
        MyThread myThread3 = new MyThread(obj2, obj1);
        MyThread myThread2 = new MyThread(obj3, obj2);

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
