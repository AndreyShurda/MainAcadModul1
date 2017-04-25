package com.shurda.andrey.basics.Lab2_17.testdeadlock1;

public class MyThread extends Thread {
    private MyObject obj;
    private MyObject obj2;

    public MyThread(MyObject obj, MyObject obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        String name = this.getName();
        synchronized (obj) {
            System.out.println(name + " : Holding lock " + name + "...");
            try {
                sleep(100);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
            System.out.println(name + " : Waiting lock " + name + "...");
            synchronized (obj2) {
                System.out.println(name + " Holding lock 1 & 2...");
            }
        }
    }
}


