package com.shurda.andrey.Lab2_17.testconcoll1;

import java.util.Map;

public class Writer extends Thread {
    private static Map<String, String> map;
    private int size;

    public Writer(Map<String, String> map, int size) {
        this.map = map;
        this.size = size;
        start();
    }

    @Override
    public void run() {
//                for HashMap
        synchronized (map) {
            for (int i = 0; i < size; i++) {
                String value = this.getName() + " value" + i;
                String key = this.getName() + " key" + i;
                map.put(key, value);
                System.out.println(this.getName() + " put: " + value);
            }
        }
    }
}
