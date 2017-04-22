package com.shurda.andrey.se.Lab1_1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a class called ReplacementInFile whose main(String[] args) method read the source code of
 * any Java-program and replaces all the words public on private. The file name must be entered from the keyboard.
 */
public class ReplacementInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        String path = System.getProperty("user.dir");
        String folder = "\\src\\com\\shurda\\andrey\\se\\Lab1_1\\";
        String currentFolder = path + folder;
//        System.out.println(currentFolder);

        System.out.print("Enter the name of any Java-program file: ");
        String line = scanner.nextLine();

        replaceStringInFile(currentFolder, line, "public", "private");
//        replaceStringInFileFileReader(currentFolder, line, "public", "private");
    }

    public static void replaceStringInFile(String currentFolder, String line, String search, String replace) {
        Path pathFile = Paths.get(currentFolder + line + ".java");
        Charset charset = StandardCharsets.UTF_8;

        String content = null;
        try {
            content = new String(Files.readAllBytes(pathFile), charset);
            content = content.replaceAll(search, replace);
            Files.write(pathFile, content.getBytes(charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceStringInFileFileReader(String currentFolder, String line, String search, String replace) {
        File file = new File(currentFolder + line + ".java");

        try {
            FileReader fileReader = new FileReader(file);
            String s;
            String totalStr = "";
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                while ((s = bufferedReader.readLine()) != null) {
                    totalStr += s;
                }
                totalStr = totalStr.replaceAll(search, replace);
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(totalStr);
                fileWriter.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
