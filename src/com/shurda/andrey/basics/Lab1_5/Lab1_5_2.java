package com.shurda.andrey.basics.Lab1_5;

import java.util.Scanner;

/**
 * 1. Write a program which prompts user for the number "x", reads it from the keyboard,
 * and saves it in an int variable called "x".
 * 2. Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x >9, respectively.
 * 3. Use: (a) a "nested-if" statement; (b) a "switch-case" statement.
 * 4. The output shall look like (user input – in green):
 * -Enter number x: 1 -Enter number x: 12
 * -One               - Other
 */
public class Lab1_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-Enter number x:");
        String s = sc.nextLine();

        int a = Integer.valueOf(s);
        String st;

        if (a == 1)
            st = "-One";
        else if (a == 2)
            st = "-Two";
        else if (a == 3)
            st = "-Three";
        else if (a == 4)
            st = "-Four";
        else if (a == 5)
            st = "-Five";
        else if (a == 6)
            st = "-Six";
        else if (a == 7)
            st = "-Seven";
        else if (a == 8)
            st = "-Eight";
        else if (a == 9)
            st = "-Nine";
        else
            st = "-Other";

        System.out.println("If:" + st);

        System.out.print("-Enter number x:");
        s = sc.nextLine();
        a = Integer.valueOf(s);

        switch (a) {
            case 1:
                st = "-One";
                break;
            case 2:
                st = "-Two";
                break;
            case 3:
                st = "-Three";
                break;
            case 4:
                st = "-Four";
                break;
            case 5:
                st = "-Five";
                break;
            case 6:
                st = "-Six";
                break;
            case 7:
                st = "-Seven";
                break;
            case 8:
                st = "-Eight";
                break;
            case 9:
                st = "-Nine";
                break;

            default:
                st = "-Other";
                break;
        }
        System.out.println("switch:" + st);

    }
}
