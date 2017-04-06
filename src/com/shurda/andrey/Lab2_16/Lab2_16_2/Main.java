package com.shurda.andrey.Lab2_16.Lab2_16_2;

/**
 * Created by admin on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        byte b = 5;
        foo(5);
    }
    public static void foo(int i){
        System.out.println("int");
    }
    public static void foo(Byte b){
        System.out.println("Byte");
    }
}
