package com.shurda.andrey.Lab1_4;

/**
 * Write a console program that prints result of bit shift operators for integer variable.
 */
public class Lab1_4_5 {
    public static void main(String[] args) {
        int a = 32;
        int b = a;
        int c = a >> 2;
        int d = a << 3;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("b = " + b / 2 / 2);
        System.out.println("b = " + b * 2 * 2 * 2);
    }
}
