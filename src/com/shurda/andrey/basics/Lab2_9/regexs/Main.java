package com.shurda.andrey.basics.Lab2_9.regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create new project called TestRegExp. Add package “com.brainacad.oop.testsregexp”. Create a class Main with a main() method. Create public static method checkPersonWithRegExp(String userNameString) which take String as argument and return boolean value. This method must return true only if argument string value begin from Uppercase, then other chars in Lowercase and contains only letters. In main() method declare array of String with next values: {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “} Add code to check each of these values with checkPersonWithRegExp() method and print result to console.
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", ""};

        for (String s : arr) {
            System.out.println(s + " is " + checkPersonWithRegExp(s));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[A-Z][a-z]+");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}
