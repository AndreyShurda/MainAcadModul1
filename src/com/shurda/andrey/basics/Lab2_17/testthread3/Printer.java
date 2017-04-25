package com.shurda.andrey.basics.Lab2_17.testthread3;

public class Printer extends Thread {
    private Storage storage;
    private long count;

    public Printer(Storage storage, long count) {
        this.storage = storage;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(storage.getValue());
        }
//        System.out.println("Printer DONE!!!");
    }
}
