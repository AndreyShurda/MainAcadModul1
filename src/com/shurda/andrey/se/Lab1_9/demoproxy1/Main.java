package com.shurda.andrey.se.Lab1_9.demoproxy1;

import java.lang.reflect.Proxy;

/**
 * Create new project called DemoProxy1. Add package “com.brainacad.demoproxy1.
 * 1) Create a Calculate interface with methods: multiplication() and division() that perform a multiplication and
 * a division of two numbers.
 * 2) Create a CalculateImpl class, which implements the interface Calculate.
 * 3) Create a CalculateProxy class, which is used as a invocation handler, and includes:
 * - a objCalc field of type Object and a private constructor to initialize (contains target object);
 * - overridden invoke() method, which outputs information about that method is called (name), with what arguments,
 * and what was the result, and dispatches the execution target object;
 * - static method Object newInstance (Object obj), which receives the target object and creates a proxy class instance;
 * 4) Create a Main class with a main() method, which demonstrates the calculation of a proxy class.
 */
public class Main {
    public static void main(String[] args) {
        Calculate calculate = new CalculateImpl();
        System.out.println(calculate.multiplication(2, 5));
        System.out.println(calculate.division(45, 9));

        Calculate proxyCalculate = (Calculate) CalculateProxy.newInstance(calculate);

        proxyCalculate.multiplication(4,5);
        proxyCalculate.division(9,3);
    }
}
