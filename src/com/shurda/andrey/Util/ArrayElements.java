package com.shurda.andrey.Util;

import java.util.Arrays;

public class ArrayElements {

    private ArrayElements() {
    }

    public static <T> T[] addElements(T[] elements, T newElement) {
        T[] newArrayElements = Arrays.copyOf(elements, elements.length + 1);
        newArrayElements[newArrayElements.length - 1] = newElement;

        return newArrayElements;
    }
}
