package com.shurda.andrey.Lab2_17.testconcoll1;

import java.util.Iterator;
import java.util.Map;

public class Reader extends Thread {
    private static Map<String, String> map;

    public Reader(Map<String, String> map) {
        this.map = map;
        start();
    }

    @Override
    public void run() {
//        for HashMap
        synchronized (map) {
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<String, String> next = iterator.next();
                System.out.println(this.getName() + " get: " + next.getKey() + " " + next.getValue());
            }
        }
    }
}
