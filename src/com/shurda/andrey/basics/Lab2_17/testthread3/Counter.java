package com.shurda.andrey.basics.Lab2_17.testthread3;

public class Counter extends Thread {
    private Storage storage;
    private long count;

    public Counter(Storage storage, long count) {
        this.storage = storage;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            storage.increment();
        }
//        System.out.println("Counter DONE!!!");
    }
}
