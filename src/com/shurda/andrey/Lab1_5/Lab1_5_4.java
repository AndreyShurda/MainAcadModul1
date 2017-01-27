package com.shurda.andrey.Lab1_5;

/**
 * The program must print the first 10 numbers that is divisible evenly by 3 or 4,
 * but for loop iterates from 1 to 300 (so break statement must be used after 10 printed result).
 * The output shall look: 3 4 … 20
 */
public class Lab1_5_4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 300; i++) {
            if (i > 0 && (i % 3 == 0 || i % 4 == 0)) {
                System.out.println(i);
                if (++count >= 10)
                    break;
            }
        }
    }
}
