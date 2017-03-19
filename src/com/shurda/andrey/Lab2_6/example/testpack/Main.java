package com.shurda.andrey.Lab2_6.example.testpack;

//import com.brainacad.carpack.Car;
import com.shurda.andrey.Lab2_6.example.applepack.Apple;

/**
 * Create a project with structure:
 * package example.applepack
 * package com.brainacad.carpack
 * package example.testpack
 * <p>
 * Create two classes:
 * 1. Class of Apple (in the package example.applepack) with methods getMass(), setMass(),
 * which provide access to the field “weight” as double type.
 * 2. Class of Car (in the package com.brainacad.carpack) with methods getMass(), setMass(),
 * which provide access to the field “weight” as double type.
 * <p>
 * Create class Main (in the package example.testpack) with method main(),
 * which creates an instance of Apple and Car (use import statement ),
 * then prints its value of weight for each instance;
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
//        Car car = new Car();

        System.out.println("Apple mass is: "+apple.getMass());
//        System.out.println("Car mass is: "+car.getMass());
    }
}
