package com.shurda.andrey.basics.Lab2_11;

/**
 * Write a class MyTest with a method test() that throws an exception of the MyException type.
 * Try compiling it without an exception specification to see what the compiler says.
 * Add the appropriate exception specification (throws).
 * Try out your class and its exception inside a try-catch clause.
 * Execute the program.
 */
public class MyTest {
    public static void test() {
        throw new MyException("Use Exception");
    }

    public static void main(String[] args) {
        MyTest myTestVar = null;
        try {
            myTestVar.getClass();
            myTestVar.test();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            e.printMsg();
        }
    }
}
