package com.shurda.andrey.Lab2_9.com.brainacad.oop.teststring3;

/**
 * Create a class Main with a main() method.
 * Create static method: uniqueChars(String s),
 * which must take a String as argument and return an array of distinct (unique) chars (char[]) of the given string.
 * In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument. Print result to console.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(uniqueChars("Using methods of class String"));
        System.out.println("Using methods of class String".chars().distinct());
    }

    public static void uniqueChars(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]){

                }
            }
        }
//        }

//        return chars;

    }
}
