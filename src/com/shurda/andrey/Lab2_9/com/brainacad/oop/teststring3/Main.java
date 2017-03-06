package com.shurda.andrey.Lab2_9.com.brainacad.oop.teststring3;

import com.shurda.andrey.Util.ArrayElements;

import java.util.Arrays;

/**
 * Create a class Main with a main() method.
 * Create static method: uniqueChars(String s),
 * which must take a String as argument and return an array of distinct (unique) chars (char[]) of the given string.
 * In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument. Print result to console.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Find unique chars in this string: ");
        System.out.println("Using methods of class String");
        System.out.println("The unique chars is: ");
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[i] == chars[j]) {
                    break;
                }
                if (j == chars.length - 1) {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString().toCharArray();
    }
}
