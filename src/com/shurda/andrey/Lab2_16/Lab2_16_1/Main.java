package com.shurda.andrey.Lab2_16.Lab2_16_1;

/**
 * Student should create class Animal and extends from him create class Dog.
 * Student should create class Main which has two methods foo(Animal a) and foo(Dog d).
 * This methods print to console “Animal” and “Dog” respectively.
 * Student should create and provide all necessary code in a method main()
 * to show how does overload resolution works when we put this reference(Animal a = new Dog();) to method (foo).
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal a = new Dog();

        foo(animal);
        foo(a);
        foo(dog);
    }

    public static void foo(Animal a){
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }
}
