package com.shurda.andrey.se.Lab1_5.testrecflaction1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Create a class Main with a main() method.
 * 1) Add new class MyClass with fields: a, b, c, d of integer type and different access modifiers.
 * Add to class getters, setters and few constructors with different parameters.
 * 2) Add code to main() method that declares local variable c of MyClass type, and create instance
 * of MyClass. Write code to discover created object and print all information about fields,
 * constructors and methods to console.
 * 3) Execute the program. The program output must be like next example:
 * Class name: com.brainacad.oop1.testreflection1.
 * MyClass Modifiers:
 * final
 * Public fields:
 * Name: a
 * Type: int
 * All fields:
 * Name: a
 * Type: int
 * Name: b
 * Type: int
 * …
 * Constructors:
 * Constructor 0 :
 * Constructor 1 : int int
 * …
 * Methods:
 * Name: setA
 * Return type: void
 * Param types: int
 * …
 */
public class Main {
    public static void main(String[] args) {
        Class<MyClass> c = MyClass.class;

        System.out.println(c.getName());
        if (Modifier.isFinal(c.getModifiers())) {
            System.out.println("MyClass Modifiers: \nfinal");
        }
        System.out.println("Public fields:");
        for (Field field : c.getDeclaredFields()) {
            if (Modifier.isPublic(field.getModifiers())) {
                System.out.println("Name: " + field.getName());
            }
        }
        System.out.println();

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + field.getGenericType());
        }

        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("\nConstructors:");

        int count = 0;
        for (Constructor<?> constructor : constructors) {
            System.out.print("Constructor" + (count++) + ":");
            for (Class<?> type : constructor.getParameterTypes()) {
                System.out.print(type + " ");
            }
            System.out.println();
        }


        Method[] methods = c.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.print("Param types: ");
            for (Class<?> type : method.getParameterTypes()) {
                System.out.print(type.getSimpleName() + " ");
            }
            System.out.println();
        }
    }
}

