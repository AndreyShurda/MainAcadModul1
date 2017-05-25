package com.shurda.andrey.se.Lab1_5.testrecflaction2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Add package “com.brainacad.oop.testrecflection2”.
 * Create a class Main with a main() method.
 * 1) Add to method main() code that declares local variable myStr of String type with “abcd” value.
 * Write code to get access and change values (using reflection) of private field “char value[]”,
 * which is used for character storage. The new values set to [z,x,c,v].
 * 2) Add code to print this string before and after private field values modification to console.
 * 3) Then add next code: System.out.println(“abcd”);
 * 4) Execute the program. The program output must be like next example:
 * Old string value: abcd
 * New string value: zxcv
 * zxcv
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abcd";

        try {
            Field field = myStr.getClass().getDeclaredField("value");
            System.out.println("Old string value: " + myStr);
            field.setAccessible(true);
            field.set(myStr, new char[]{'z', 'x', 'c', 'v'});
            field.setAccessible(false);
            System.out.println("New string value: " + myStr);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(myStr);
    }
}
