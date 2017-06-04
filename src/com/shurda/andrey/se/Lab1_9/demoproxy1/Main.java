package com.shurda.andrey.se.Lab1_9.demoproxy1;

import java.lang.reflect.Proxy;

/**
 * Lab1-9-1
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
 * <p>
 * Lab1-9-2
 * 1) Create a CalculateBitwise interface with methods: andBitwise() and orBitwise() that perform a operation & (AND)
 * and a operation | (OR) of two numbers.
 * 2) Create a CalculateBitwiseImpl class, which implements the interface CalculateBitwise.
 * 3) Rewrite a CalculateProxy class that it contains:
 * - a interfaces field as an array type Class for implemented interfaces;
 * - a delegates field as an array type Object for target objects;
 * - a private constructor to initialize these fields;
 * 4) Rewrite a newInstance() of CalculateProxy class, that receives the interface class, creates an arrays of target
 * objects and implemented interfaces, and creates a proxy class instance, if the specified interface is part of an array
 * of interfaces this the proxy class;
 * 5) Rewrite a invoke() method of CalculateProxy class, which determines which interface belongs a method and delegate
 * its performance to the appropriate object;
 * 6) Rewrite a main() method of Main class, which demonstrates the create instance of a proxy class and the invoke of
 * methods different interfaces.
 */
public class Main {
    public static void main(String[] args) {
        Calculate calculate = new CalculateImpl();
        System.out.println(calculate.multiplication(2, 5));
        System.out.println(calculate.division(45, 9));

        Calculate proxyCalculate = (Calculate) CalculateProxy.newInstance(Calculate.class);

        proxyCalculate.multiplication(4, 5);
        proxyCalculate.division(9, 3);

        CalculateBitwise calculateBitwise = (CalculateBitwise) proxyCalculate;

        calculateBitwise.andBitwise(4, 5);
        calculateBitwise.orBitwise(4, 5);


    }
}
