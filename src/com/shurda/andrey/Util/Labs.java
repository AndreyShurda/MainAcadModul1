package com.shurda.andrey.Util;

import java.util.Arrays;
import java.util.Scanner;

public class Labs {

    private Labs() {
    }

    public static <T> T[] addElements(T[] elements, T newElement) {
        T[] newArrayElements = Arrays.copyOf(elements, elements.length + 1);
        newArrayElements[newArrayElements.length - 1] = newElement;

        return newArrayElements;
    }

    public static int getPositiveInteger(String msg) {
        Scanner scanner = new Scanner(System.in);
        String intNumber;
        boolean isInt;
        int positiveNumber = 0;
        do {
            System.out.print("Enter number " + msg + " :");
            isInt = scanner.hasNextInt();
            intNumber = scanner.nextLine();
            if (!isInt) {
                System.out.println("It's not a number. Please enter an integer number");
            } else {
                positiveNumber = Integer.valueOf(intNumber);
                if (positiveNumber <= 0)
                    System.out.println("Enter positive number");
            }
        } while (!isInt || positiveNumber <= 0);

        return positiveNumber;
    }
}
