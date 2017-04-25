package com.shurda.andrey.basics.Lab2_16.Lab2_16_2;

/**
 * Student should create a new blank Java Project in IDE. • Student should create his or
 * her own Java class Main with methods void foo(int i)
 * which print “int” to console and void foo(Byte b) which print “Byte”;
 * In a method main() student should create variable (byte b) and put it
 * to method (foo) and look what will be output
 */
public class Main {
    public static void main(String[] args) {
        byte b = 5;
        foo(5);
    }
    public static void foo(int i){
        System.out.println("int");
    }
    public static void foo(Byte b){
        System.out.println("Byte");
    }
}
