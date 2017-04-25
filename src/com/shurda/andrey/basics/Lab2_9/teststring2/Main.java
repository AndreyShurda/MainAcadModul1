package com.shurda.andrey.basics.Lab2_9.teststring2;

import java.util.StringTokenizer;

/**
 * Create a class Main with a main() method. In method main() declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second. Write code to display all of the letters, which are present in the first word, but absent in the second.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        StringTokenizer s = new StringTokenizer(myStr1, myStr2);
        while (s.hasMoreElements()) {
            System.out.print(s.nextElement() + " ");
        }

    }
}
