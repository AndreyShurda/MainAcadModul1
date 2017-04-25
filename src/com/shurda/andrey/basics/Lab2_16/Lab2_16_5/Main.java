package com.shurda.andrey.basics.Lab2_16.Lab2_16_5;

/**
 * Student should create a new blank Java Project in IDE.
 * Student should create his or her own Java class Main with methods void foo(int i) which print “int”
 * to console and void foo(byte b) which print “byte”;
 * In a method main() student should create variable (byte b = 5;)
 * and put it to method (foo) and look what will be output. Then he should put simple number (for example 5) directly to method.
 * Explain result
 */
public class Main {
    public static void main(String[] args) {
        byte b = 5;
        foo(b);
        foo(5);
    }

    public static void foo(int i){
        System.out.println("int");
    }
    public static void foo(byte b){
        System.out.println("byte");
    }
}
