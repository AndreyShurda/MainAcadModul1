package com.shurda.andrey.Lab2_5;

/**
 Create class MyInitTest with two initialization blocks,
 two static initialization blocks and two constructors (one constructor()
 must invoke second constructor(int)).
 On each block write code that prints on console type of block and block number.

 For example:
 “static initialization block 1”
 “static initialization block 2”
 “non-static initialization block 1”
 “non-static initialization block 2”
 “constructor 1”
 “constructor 2”
 Create class Main, which will create instance of class MyInitTest by invoking first constructor.
 */
public class MyInitTest {

    {
        System.out.println("non-static initialization block 1");
    }

    static {
        System.out.println("static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 2");
    }


    public MyInitTest() {
        this(2);
        System.out.println("constructor 1");
//        new MyInitTest(1);
    }

    public MyInitTest(int a) {
//        this();
        System.out.println("constructor 2");
    }

    public static void main(String[] args) {
        MyInitTest myInitTest = new MyInitTest();
    }
}
