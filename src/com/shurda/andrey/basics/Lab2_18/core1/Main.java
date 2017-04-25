package com.shurda.andrey.basics.Lab2_18.core1;

import java.math.BigInteger;
/**
 * Create new project called  TestCore1. Add package “com.brainacad.oop.testcore1”. Write program which calculates
 * the factorial of N, where N is set at random in the range of 10 to 50 (use BigInteger to get the result).
 * 1) Create a class Main with a factorial() method, which takes one argument as an integer number N and returns it the factorial. 
 * 2) Add in Main class the main() method, which defines a positive integer number, passes it to the method factorial()
 * and prints the result.
 * 3) Execute the program. The program output must be like next example:
 * 34! = 295232799039604140847618609643520000000
 */
public class Main {
    public static void main(String[] args) {
        int n = (int) (10 + Math.random() * 40);

        System.out.println(n + "! = " + factorial(n));
    }

    private static BigInteger factorial(int n) {
        return n <= 1 ? BigInteger.valueOf(1) : factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
}
