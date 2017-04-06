package com.shurda.andrey.Lab2_15.testmygen;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);

        List<Number> numberList = myNumGenerator.generate();

        System.out.println(Arrays.toString(numberList.toArray()));

    }
}
