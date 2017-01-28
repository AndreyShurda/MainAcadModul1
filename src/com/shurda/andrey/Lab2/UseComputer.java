package com.shurda.andrey.Lab2;

/**
 * Write a program to create array of Computer objects (5 pcs.).
 * Declare array of Computer objects (5 pcs.),
 * create 5 Computer objects and place it to array (using loop).
 */
public class UseComputer {
    public static void main(String[] args) {
        Computer[] arrayComputers = new Computer[5];

        for (int i = 0; i < arrayComputers.length; i++) {
            arrayComputers[i] = new Computer("Mac",i+1*1500,i+1,200);
            arrayComputers[i].setPrice(100*arrayComputers[i].getQuantityCPU());
        }

        for (int i = 0; i < arrayComputers.length; i++) {
            arrayComputers[i].setPrice((float) (arrayComputers[i].getPrice()+i*10));
        }

        for (Computer computer : arrayComputers) {
            computer.view();
        }
    }
}
