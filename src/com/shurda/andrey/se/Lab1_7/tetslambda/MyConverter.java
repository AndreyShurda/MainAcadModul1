package com.shurda.andrey.se.Lab1_7.tetslambda;

@FunctionalInterface
public interface MyConverter {
    String convertStr(String str);

    static boolean isNull(String str) {
        return str == null;
    }


}
