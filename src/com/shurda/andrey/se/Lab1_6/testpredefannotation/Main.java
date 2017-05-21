package com.shurda.andrey.se.Lab1_6.testpredefannotation;

/**
 * Add package “com.brainacad.oop.testpredefannotation”.
 * 1) Create a class Main with a findMax() static method with array varargs type of int, which returns the maximum of
 * the parameters passed. Add in class Main the main() method, which invokes a findMax() method and output result on console.
 * Execute the program.
 * 2) Add into the description a findMax() method @Deprecated annotation and and look what happened.
 * Add into the description a main() method @SuppressWarnings("deprecation") annotation and look what happened.
 * 3) Add in class Main the generic static method findMax() with array parameter varargs type of T, which returns
 * the maximum of the parameters passed. Add in main() method invocation a findMax() generic method and output result on console.
 * Consider that tells the compiler.
 * 4) Add into the description a findMax() generic method @SafeVarargs annotation and look what happened.
 */
public class Main {
    @SuppressWarnings("deprecation")
//    @SafeVarargs
    public static void main(String[] args) {
        int[] arr = {4, 12, 1, 2, 9, 0};
        System.out.println(findMax(arr));
        System.out.println(findMax(1.0, 5.0, 6.6));
    }

    @Deprecated
    public static int findMax(int... vars) {
        int max = vars[0];
        for (int var : vars) {
            if (max < var) {
                max = var;
            }
        }
        return max;
    }

    @SafeVarargs
    private static <T extends Comparable<T>> T findMax(T... vars) {
        T max = vars[0];
        for (T var : vars) {
            if (max.compareTo(var) == -1) {
                max = var;
            }
        }
        return max;
    }
}
