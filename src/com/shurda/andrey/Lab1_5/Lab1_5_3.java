package com.shurda.andrey.Lab1_5;

/**
 * Created by admin on 16.01.2017.
 */
public class Lab1_5_3 {
    public static void main(String[] args) {
        int a = 9;
        for (int i = 0; i <= a ; i++) {
            if (i != 0)
                System.out.print(i+"| ");
            else
                System.out.print("*| ");
            for (int j = 0; j <= a ; j++) {
                if (i==0) {
                    System.out.print(j+" ");
                }
                else
                    System.out.print(i*j+" ");
            }
            if (i==0) {
                System.out.println();
                System.out.println("----------------------------");
            }else
                System.out.println();
        }
    }
}
