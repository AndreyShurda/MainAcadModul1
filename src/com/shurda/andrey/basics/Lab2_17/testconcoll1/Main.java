package com.shurda.andrey.basics.Lab2_17.testconcoll1;

import java.util.Map;

/**
 * Add package “com.brainacad.oop.testconcoll1”.
 * Write a program where multiple threads read and write to a Map data structure  (e.g. ConcurrentHashMap)
 * using java.util.concurrent  framework.  Write the same program, but now using HashMap and “synchronized”
 * instead of the concurrent framework. Play with the number of threads (readers and writers) and note
 * differences in the performances. 
 * Execute the program several times.
 */
public class Main {
    public static void main(String[] args) {
//        Map<String, String> map = new ConcurrentHashMap<>();
        Map<String, String> map = new MyHashMapSync<>();
//        Map<String, String> map = new HashMap<>();

        long before = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            Writer writer = new Writer(map, 10000);
            Reader reader = new Reader(map);
            try {
                writer.join();
                reader.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        System.out.println(map);
        System.out.println(map.size());

        System.out.println("Time: "+(System.currentTimeMillis() - before));


    }
}
