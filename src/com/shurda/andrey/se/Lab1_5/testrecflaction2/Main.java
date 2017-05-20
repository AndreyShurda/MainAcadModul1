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
    private char[] value = {'a', 'b', 'c', 'd'};
    private int a = 1;

    public static void main(String[] args) {
        String myStr = "abcd";


        Class<Main> cls = Main.class;
        try {
            Main obj = new Main();
//            Field field = cls.getDeclaredField("a");
            Field field = cls.getDeclaredField("value");
            System.out.println("Old string value:" + Arrays.toString((char[]) field.get(obj)));
            field.setAccessible(true);
            field.set(obj, new char[]{'z', 'x', 'c', 'v'});

            System.out.println("New string value: " + Arrays.toString((char[]) field.get(obj)));

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("zxcv");
    }
}
