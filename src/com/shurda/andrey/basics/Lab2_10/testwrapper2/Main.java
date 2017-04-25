package com.shurda.andrey.basics.Lab2_10.testwrapper2;

/**
 * Add to class Main static method compute( , ) that use as argument s two different numeric wrapper classes,
 * adds the values of the two instances together,
 * and then creates a third numeric wrapper instance whose value is the sum and return it.
 * For example: static method compute(Byte, Integer) witch return Long type.
 * In method main() write code to invoke compute(,) and print result to console.
 */
public class Main {
    public static void main(String[] args) {
        Byte myBate = 0b011;
        Integer myInteger = Integer.valueOf(487);
        System.out.println("Sum Byte and Integer " + compute(myBate, myInteger));
    }

    public static Long compute(Byte b, Integer i) {
        return new Long(b + i);
    }
}
