package com.shurda.andrey.basics.Lab2_16.Lab2_16_3;

import java.util.Arrays;

/**
 * Student should create his or her own Java class Main with methods  void foo(int a, int b)
 * which print a and b to console and void foo(int … a) which print array’s content;
 * In a method main() student should put two and three integers to method (foo) and look for result.
 */
public class Main {
    public static void main(String[] args) {
        foo(1, 2);
        foo(1, 2, 3);
    }

    public static void foo(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void foo(int... arg) {
        System.out.println(Arrays.toString(arg));
    }
}
