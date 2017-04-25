package com.shurda.andrey.basics.Lab2_18.core4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created new project called TestCore4. Add package "com.brainacad.oop.testcore4".
 * Write program that demonstrates the run for execution of other programs.
 * 1) Create a class Main with a main() method? which describe an array programs of type String with the name of the
 * program (for example, notepad.exe, calc.exe, etc.). Add code that randomly selects a program from a array programs
 * and launches if for execution (using exec(...) method of class Runtime).
 * 2) Execute the program.
 * 3) Add code in main() method to enter the program name using the keyboard (use the Scanner class).
 * 4) Execute the program.
 */
public class Main {
    public static void main(String[] args) {
        List<String> listPrograms = new ArrayList<>();
        listPrograms.add("notepad");
        listPrograms.add("calc");

        for (String program : listPrograms) {
            runProgram(program);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of program, which you want to run: ");
        String program = scanner.nextLine();

        runProgram(program);

    }

    private static void runProgram(String program) {
        try {
            Process process = Runtime.getRuntime().exec(program);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
