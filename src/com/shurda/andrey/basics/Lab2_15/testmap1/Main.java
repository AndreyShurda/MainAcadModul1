package com.shurda.andrey.basics.Lab2_15.testmap1;

import java.util.Scanner;

/**
 * Create new project called  TestMap1. Add package “com.brainacad.oop.testmap1”.
 * 1) Create a class MyTranslator with private field dictionary of HashMap<String,String> type.
 * Add method addNewWord(String en, String ru), which add to dictionary new word in two languages.
 * 2) Add a new method translate(String en) which take some string in English, and returns its translation in Russian as the value of the type String.
 * 3) Create a class Main with a main() method. Add to method main() code creates instance of MyTranslator.
 * Add code to fill MyTranslator with few en-rus words pair by invoking addNewWord() method.
 * For example:
 * “сat”,  “кот”
 * “mouse”, “мышь” 
 * …  
 * 4) Add code to read string from console and pass it into translate method. Print result to console.
 * 5) Execute the program.
 * The program output must be like next example:
 * cat caught mouse
 * кот поймал мышь
 */
public class Main {
    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();

        translator.addNewWord("cat", "кот");
        translator.addNewWord("dog", "собака");
        translator.addNewWord("mouse", "мишь");
        translator.addNewWord("caught", "поймал");

//        System.out.println(translator.translate("cat"));

        readFromConsol(translator);
    }

    private static void readFromConsol(MyTranslator translator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter on English words:");
        String s = scanner.nextLine();

        String[] strings = s.split(" ");
        for (String string : strings) {
            String translate = translator.translate(string);
            if (translate != null) {
                System.out.print(translate);
                System.out.print(" ");
            }
        }
    }
}
