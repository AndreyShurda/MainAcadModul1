package com.shurda.andrey.basics.Lab1_4;

/**
 Write a console program that prints result type casting for different primitive types.
 */
public class Lab1_4_8 {
    public static void main(String[] args) {
        int a = 258;
        byte b = (byte) a;
        long l = 3_000_000_000L;
        int c = (int) l;

        System.out.println("Int " + a + " cast to byte" + b);
        System.out.println("Long " + l + " cast to int" + c);
    }
}
