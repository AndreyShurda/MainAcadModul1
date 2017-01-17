package com.shurda.andrey.Lab1_5;

import java.util.Scanner;

/**
 * Created by admin on 16.01.2017.
 */
public class Lab1_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        String s = sc.nextLine();
        int a = Integer.valueOf(s);

        for (int i = 1; i <= a; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i-j);
            }
            System.out.println();
        }
    }
}
