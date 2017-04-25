package com.shurda.andrey.basics.Lab2_10.testwrapper;

/**
 * Create class Main with method main().
 * In main() method declare few xN local variable of Integer class and initialize it with same value (lower then 128), but in different manner.
 * For example: Integer x1 = 10;
 * Integer x2 = new Integer(10);
 * Integer x4 = Integer.valueOf(10);
 * Integer x5 = Integer.parseInt(“10”);
 * Compare it to each other using “==” and equals(), print result to console.
 * Do the same, but for value higher than 128.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 11;
        Integer x2 = new Integer(11);
        Integer x3 = (11);
        Integer x4 = Integer.valueOf(11);
        Integer x5 = Integer.parseInt("11");

        System.out.print("Compare x1 == x2 ");
        System.out.println(x1 == x2);
        System.out.print("Compare x1 == x3 ");
        System.out.println(x1 == x3);
        System.out.print("Compare x1 == x4 ");
        System.out.println(x1 == x4);
        System.out.print("Compare x1 == x5 ");
        System.out.println(x1 == x5);

        System.out.print("Compare x1.equals(x2) ");
        System.out.println(x1.equals(x2));
        System.out.print("Compare x1.equals(x3) ");
        System.out.println(x1.equals(x3));
        System.out.print("Compare x1.equals(x4) ");
        System.out.println(x1.equals(x4));
        System.out.print("Compare x1.equals(x5) ");
        System.out.println(x1.equals(x5));
    }
}
