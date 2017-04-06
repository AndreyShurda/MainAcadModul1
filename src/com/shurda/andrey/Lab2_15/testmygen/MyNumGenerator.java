package com.shurda.andrey.Lab2_15.testmygen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Add package “com.brainacad.oop.testmygen”.
 * 1) Create class MyNumGenerator with two fields: numOfElm and maxNumb of int type, constructor with two parameters and method generate()
 * which return new collection (of List type) with numOfElm length,  filled with numbers from 0 to  maxNumb .
 * 2) Create a class Main with a main() method. Add to method main() code to create instance of MyNumGenerator
 * (for example with 5, 64 parameters) and print result of invoking generate() method to console. 
 * 3) Execute the program.
 * The program output must be like next example: [43,15,60,2,5]
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Number> generate() {
        List<Number> list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));
        }

        return list;
    }
}
