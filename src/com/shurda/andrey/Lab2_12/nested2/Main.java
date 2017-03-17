package com.shurda.andrey.Lab2_12.nested2;

/**
 * 1) Create a new class MyTestClass that has method test(), static nested class MyStaticNested,
 * inner class MyInner and a method with local inner class MyLocal.  Make instances of each nested classes.
 * 2) Create class Main with method main() and add code that accesses the nested classes’ members from the outer class.
 * Create code that accesses the outer class’s members from within the nested classes.
 * 3) Execute the program
 */
public class Main {
    public static void main(String[] args) {
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        MyTestClass myTestClass = new MyTestClass();
        MyTestClass.MyInner myInner = myTestClass.new MyInner();
        myTestClass.test();
        myTestClass.someMothod();
    }
}
