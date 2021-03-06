package com.shurda.andrey.basics.Lab2_15.testcolection2;

import java.util.*;

/**
 * Add package �com.brainacad.oop.testcollection2�. Create a class Main with a main() method.
 * Add to method main() code that declares list variable (of List type) of string objects as LinkedList<String>.
 * Write code to fill this list in loop with string values like: �num_� and number of current iteration (from 0 to 10).
 * But element insertion point must be generated randomly (from 0 to current collection length).
 * Add code which iterates over list and print current element value to console. Execute the program.
 * The program output must be like next example:
 * number_5
 * number_2
 * number_7
 * �
 * number_3
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(i + 1), "number_" + i);
        }

        for (String item : list) {
            System.out.println(item);
        }
    }
}
