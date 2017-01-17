package com.shurda.andrey.Lab1_5;

/**
 * Created by admin on 16.01.2017.
 */
public class Lab1_5_4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <300 ; i++) {
            if (i>0 && (i%3==0 || i%4==0)) {
                System.out.println(i);
                if (++count>=10)
                    break;
            }
        }
    }
}
