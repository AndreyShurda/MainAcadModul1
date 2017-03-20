package com.shurda.andrey.Lab2_14.testgeneric2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] arrayInteger = new Integer[10];
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = random.nextInt(20);
        }
        MyTestMethod.calcNum(arrayInteger, 8);


        Double[] arrayDouble = new Double[10];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = random.nextInt(20)*1.11;
        }
        MyTestMethod.calcNum(arrayDouble, 5.5);
    }
}
