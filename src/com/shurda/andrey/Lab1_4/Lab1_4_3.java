package com.shurda.andrey.Lab1_4;

/**
 * Created by admin on 14.01.2017.
 */
public class Lab1_4_3 {
    public static void main(String[] args) {
        boolean a1 = true;   boolean b1 =true;
        boolean a2 = false;  boolean b2 =true;
        boolean a3 = true;   boolean b3 =false;
        boolean a4 = false;  boolean b4 =false;

        System.out.println("  A\t\t\t B\t\t\tA & B\t\tA | B\t\tA ^ B\t\t!A");
        System.out.println(a1+"\t|\t"+b1+"\t|\t"+(a1&b1)+"\t|\t"+(a1|b1)+"\t|\t"+(a1^b1)+"\t|\t"+!a1);
        System.out.println(a2+"\t|\t"+b2+"\t|\t"+(a2&b2)+"\t|\t"+(a2|b2)+"\t|\t"+(a2^b2)+"\t|\t"+!a2);
        System.out.println(a3+"\t|\t"+b3+"\t|\t"+(a3&b3)+"\t|\t"+(a3|b3)+"\t|\t"+(a3^b3)+"\t|\t"+!a3);
        System.out.println(a4+"\t|\t"+b4+"\t|\t"+(a4&b4)+"\t|\t"+(a4|b4)+"\t|\t"+(a4^b4)+"\t|\t"+!a4);
    }
}
