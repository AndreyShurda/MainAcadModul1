package com.shurda.andrey.Lab2_17.testthread3;

public class Storage {
    private long i;
    private boolean flag = false;

    public synchronized void increment() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        i++;
        notify();
    }

    public synchronized long getValue() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        notify();

        return i;
    }
}
