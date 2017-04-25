package com.shurda.andrey.basics.Lab2_11;

/**
 * Add to class Main assertions code that checks correct result of executing compute( , ) method.
 * The compute( , ) method use as argument s two different numeric wrapper classes,
 * adds the values of the two instances together, and then creates a third numeric wrapper instance
 * whose value is the sum and return it.  In method main() write code to invoke compute(,)
 * in assertion and compare to correct result.
 * 1. Execute the program.
 * 2. Execute the program with �ea VM parameter.
 * 3. Change code in compute( , ) method,  for example change return statement to:  return 0;
 * Execute the program.
 * 4. Execute the program with �ea VM parameter
 */
public class Lab2_11_5 {
    public static void main(String[] args) {
        Integer varInteger = 12;
        Float varFloat = 5.0F;
        assert compute(varInteger, varFloat) == varFloat + varInteger;

    }

    public static Double compute(Integer a, Float b) {
//        return Double.valueOf(a + b);
        return 0.0;
    }
}
