package com.shurda.andrey.basics.Lab2_14.testgeneric3;

import java.util.Random;

public class MyMixer <T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length);
            T temp = (T) array[i];
            array[i] = array[index];
            array[index] = (T) temp;
        }
    }
}
