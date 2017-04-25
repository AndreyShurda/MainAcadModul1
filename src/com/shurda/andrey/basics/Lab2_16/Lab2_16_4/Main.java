package com.shurda.andrey.basics.Lab2_16.Lab2_16_4;

import com.shurda.andrey.basics.Lab2_16.Lab2_16_1.Animal;
import com.shurda.andrey.basics.Lab2_16.Lab2_16_1.Dog;

/**
 * Student should create class Animal and extends from him create class Dog and extends from him create class Puppy.
 * Student should create class Main which has three methods foo(Animal a), foo(Dog d), foo(Puppy p).
 * This methods print to console “Animal”, “Dog” or “Puppy” respectively.
 * Student should create and provide all necessary code in a method main() to show how does overload resolution works when we put null to method foo. What will be print?
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        com.shurda.andrey.basics.Lab2_16.Lab2_16_1.Main.foo(animal);
        com.shurda.andrey.basics.Lab2_16.Lab2_16_1.Main.foo(dog);
        foo(puppy);
        foo(null);
    }

    public static void foo(Dog d) {
        System.out.println("Puppy");
    }
}
