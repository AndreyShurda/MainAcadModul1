package com.shurda.andrey.se.Lab1_1;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Write a class called MyFilesList whose main(String[] args) method prints to standard out the files/directories contained in
 * 1. the current directory if no args[0] specified, or,
 * 2. the directory mentioned in args[0].
 * Don't worry about formatting the output; just print one file or directory name per output line.
 */
public class MyFileList {
    public static void main(String[] args) {

//        String path = new File(".").getAbsolutePath();
        String path = System.getProperty("user.dir");
//        System.out.println("path: " + path);

        File[] files = new File[0];
        if (args.length == 0) {
            files = new File(path).listFiles();
        } else {
            files = new File(args[0]).listFiles();
        }

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
