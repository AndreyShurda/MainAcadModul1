package com.shurda.andrey.basics.Lab2_9.teststokennizer;

import java.util.StringTokenizer;

/**
 * Create a class Main with a main() method.
 * In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot” delimiter using StringTokennizer class, and iterate the StringTokenizer elements and print it out one by one to console. String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.
 */
public class Main {
    public static void main(String[] args) {

        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        String szDelemiters = "\" \".,";
        StringTokenizer st = new StringTokenizer(myStr, szDelemiters);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
