package com.shurda.andrey.se.Lab1_1;

import java.io.*;

/**
 * Write a class called MyFileCopy whose main(String[] args) method copies one file
 * (could be binary!) to another (args[0] to args[1]).

 */
public class MyFileCopy {
    public static void main(String[] args) throws IOException {
        if (args.length != 0 && args.length == 2){
            InputStream inputStream = new FileInputStream(args[0]);
            OutputStream outputStream = new FileOutputStream(args[1]);

            int read;
            while ((read = inputStream.read()) != -1){
                outputStream.write(read);
            }

            if (inputStream != null){
                inputStream.close();
            }

            if (outputStream != null){
                outputStream.close();
            }
        }
    }
}
