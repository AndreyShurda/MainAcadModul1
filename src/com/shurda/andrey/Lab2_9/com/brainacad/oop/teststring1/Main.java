package com.shurda.andrey.Lab2_9.com.brainacad.oop.teststring1;

/**
 Create a class Main with a main() method. In method main() declare local variable myStr of String type and assign a value: “abracadabra”. Using the methods of the class String, do next steps:
 * Find the index of first “ra” substring of myStr value and print result to console.
 * Find the index of last “ra” substring of myStr value and print result to console.
 * Get substring of myStr from 3 to 7 char index and print result to console.
 * Create static method reverseString(String) which return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
 * Invoke reverseString() method with myStr argument and print result to console.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        int indexOf = myStr.indexOf("ra");
        int lastIndexOf = myStr.lastIndexOf("ra");
        String substr = myStr.substring(3, 7);

        System.out.println("String \"abracadabra\" indexOf(\"ra\")  " + indexOf);
        System.out.println("String \"abracadabra\" lastIndexOf(\"ra\")  " + lastIndexOf);
        System.out.println("String \"abracadabra\" substring(3,7) " + substr);

        reverseString(new StringBuilder(myStr));
    }

    private static void reverseString(StringBuilder myStr1) {
        System.out.print("Reverse of string " + myStr1 + " result ");
        myStr1.reverse();
        System.out.println(myStr1);
    }
}





