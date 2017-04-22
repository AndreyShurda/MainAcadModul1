package com.shurda.andrey.se.Lab1_1;

import java.io.*;

/**
 * Write a class called PrintFile whose main(String[] args) method reads all the text from the file mentioned
 * on the command-line (args[0]) line-by-line and prints it to standard out.
 */
public class PrintFile {
    public static void main(String[] args) {
        try {
            BufferedReader inputStream;
            if (args.length != 0) {
                inputStream = new BufferedReader(new FileReader(args[0]));
                String line;
                while ((line = inputStream.readLine()) != null) {
                    String[] words = line.split(" ");
                    for (String word : words) {
                        System.out.println(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
