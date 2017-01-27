package com.shurda.andrey.Lab1_4;

/**
 * Write a console program that prints result of
 * increment and decrement in prefix and postfix mode for integer variable.
 */
public class Lab1_4_4 {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("a = " + a);
        System.out.println();

        int b = a++;
        System.out.println("a++");
        System.out.println("b = " + b + " a = " + a);
        System.out.println();

        int c = ++a;
        System.out.println("++a");
        System.out.println("c = " + c + " a = " + a);
        System.out.println();

        int d = a--;
        System.out.println("a--");
        System.out.println("d = " + d + " a = " + a);
        System.out.println();

        int e = --a;
        System.out.println("--a");
        System.out.println("e = " + e + " a = " + a);
    }
}
