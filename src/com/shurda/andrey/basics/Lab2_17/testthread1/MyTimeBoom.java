package com.shurda.andrey.basics.Lab2_17.testthread1;


public class MyTimeBoom extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Boom!!!");
    }
}
